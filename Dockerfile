# Use a minimal Java image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built jar into container and rename it
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Start the app
ENTRYPOINT ["java", "-jar", "app.jar"]