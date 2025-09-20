# Gunakan base image Java
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy file jar hasil build
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Jalankan aplikasi
ENTRYPOINT ["java","-jar","/app/app.jar"]
