FROM docker.io/library/node:lts as builder
COPY arthmetic /root/arthmetic
WORKDIR /root/arthmetic
RUN \
    npm install && \
    npx ng build --prod=true

FROM docker.io/library/nginx:alpine
COPY --from=builder /root/arthmetic/dist/arthmetic/ /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf
