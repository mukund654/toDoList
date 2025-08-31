# Stage 1: Build the application using Maven + JDK 21
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application using JDK 21
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/todoApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
