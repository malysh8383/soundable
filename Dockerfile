
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/Soundable-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]