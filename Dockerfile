# start with jdk base image
FROM openjdk:17-jdk-slim

MAINTAINER Alok
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]