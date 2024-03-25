FROM openjdk:17-jdk-slim

# Set the working directory in the container
ARG JAR_FILE=target/*.jar

# Copy the packaged Spring Boot JAR file into the container
COPY ./target/spring-crud-docker-0.0.1-SNAPSHOT.jar spring-crud-docker.jar

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "spring-crud-docker.jar"]