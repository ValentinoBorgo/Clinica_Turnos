FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/turnos.jar
COPY ${JAR_FILE} ClinicaTurnos.jar
ENTRYPOINT ["java", "-jar", "ClinicaTurnos.jar"]