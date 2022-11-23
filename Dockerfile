#Dockerfile for Docker_POC
FROM adoptopenjdk/openjdk11:alpine-slim
RUN mkdir app
COPY target/* app/
WORKDIR app
EXPOSE 8090
##ADD target/Docker_POC-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "docker_for_ecs-0.0.1-SNAPSHOT.jar"]