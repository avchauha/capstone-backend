# Use an official OpenJDK image as the base image
FROM openjdk:17

VOLUME /tmp

# Copy the Spring Boot JAR file from your host machine into the container
COPY target/ReelRatings-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application will listen on
EXPOSE 8080

# Specify the entry point command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
