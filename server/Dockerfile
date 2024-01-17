FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/Clinica_Turnos-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ClinicaServer.jar
ENTRYPOINT ["java", "-jar", "ClinicaServer.jar"]