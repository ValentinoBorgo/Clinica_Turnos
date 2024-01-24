FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/api_gateway.jar
COPY ${JAR_FILE} ClinicaApiGateway.jar
ENTRYPOINT ["java", "-jar", "ClinicaApiGateway.jar"]