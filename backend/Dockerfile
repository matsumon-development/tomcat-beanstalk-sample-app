FROM docker.io/adoptopenjdk/openjdk11:latest as builder
COPY api /root/api
WORKDIR /root/api
RUN ./mvnw clean package

FROM docker.io/library/tomcat:9.0
USER root
COPY --from=builder /root/api/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh", "run"]
