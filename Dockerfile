# -------- Stage 1: Build --------
FROM maven:3.9.2-eclipse-temurin-17 AS builder

# Set working directory
WORKDIR /app

# Copy Maven files separately to leverage caching
COPY pom.xml .
COPY src ./src

# Build the Spring Boot WAR (skip tests for faster build; optional)
RUN mvn clean package -DskipTests

# -------- Stage 2: Run --------
FROM tomcat:10.1.14-jdk17-temurin-focal

# Create a non-root user for security
RUN groupadd -r spring && useradd -r -g spring spring

# Remove default web apps for a clean Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR from build stage
COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Change ownership to non-root user
RUN chown -R spring:spring /usr/local/tomcat

# Switch to non-root user
USER spring

# Expose default Tomcat port
EXPOSE 8080

# Run Tomcat
CMD ["catalina.sh", "run"]
