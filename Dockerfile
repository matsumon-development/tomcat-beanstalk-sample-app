FROM docker.io/library/node:lts as frontendbuilder
COPY frontend/arthmetic /root/arthmetic
WORKDIR /root/arthmetic
RUN \
    npm install && \
    npx ng build --prod=true

FROM docker.io/adoptopenjdk/openjdk11:latest as backendbuilder
COPY backend/api /root/api
WORKDIR /root/api
RUN ./mvnw clean package

FROM docker.io/library/tomcat:9.0
USER root
WORKDIR /root
RUN \
    apt update -y && \
    apt install -y nginx && \
    useradd --shell /sbin/nologin nginx
COPY docker-entrypoint.sh /usr/local/bin/
RUN chmod 755 /usr/local/bin/docker-entrypoint.sh
COPY nginx.conf /etc/nginx/nginx.conf
COPY --from=frontendbuilder /root/arthmetic/dist/arthmetic/ /usr/share/nginx/html
COPY --from=backendbuilder /root/api/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 80
ENTRYPOINT ["docker-entrypoint.sh"]
