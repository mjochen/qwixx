# Start from a lightweight JDK runtime
FROM eclipse-temurin:17-jre-alpine


# Set the working directory inside the container
WORKDIR /app

# Copy the fat jar into the container
# COPY target/myapp-0.0.1-SNAPSHOT.jar app.jar


COPY target/Qwixx-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
