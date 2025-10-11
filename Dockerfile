# Step 1: Use an official JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set working directory inside the container
WORKDIR /app

# Step 3: Copy the Gradle build output (JAR file) into the container
# Make sure you've already run `./gradlew build` before building this image
COPY build/libs/*.jar app.jar

# Step 4: Expose a port if your app runs a web server (optional)
# EXPOSE 8080

# Step 5: Define the command to run your app
ENTRYPOINT ["java", "-jar", "app.jar"]
