FROM postgres:15-alpine

ENV POSTGRES_DB dvdrental
ENV POSTGRES_PASSWORD 123456

COPY dvdrental.tar /
COPY init.sh /docker-entrypoint-initdb.d/