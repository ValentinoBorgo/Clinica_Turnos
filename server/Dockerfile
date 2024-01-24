FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/server.jar
COPY ${JAR_FILE} ClinicaServer.jar
ENTRYPOINT ["java", "-jar", "ClinicaServer.jar"]