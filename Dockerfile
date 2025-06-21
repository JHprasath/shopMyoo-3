# Use OpenJDK 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy all files to the container
COPY . .

# Build the Spring Boot application (skip tests)
RUN ./mvnw clean package -DskipTests

# Expose the default Spring Boot port
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/e-commerce-app-0.0.1-SNAPSHOT.jar"]
