FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/turnos-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ClinicaTurnos.jar
ENTRYPOINT ["java", "-jar", "ClinicaTurnos.jar"]