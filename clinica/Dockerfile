FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/clinica.jar
COPY ${JAR_FILE} ClinicaPacientes.jar
ENTRYPOINT ["java", "-jar", "ClinicaPacientes.jar"]