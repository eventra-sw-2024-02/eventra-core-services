FROM eclipse-temurin:21-jdk-alpine
LABEL authors="andyjackdelaguilavillanueva"
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/event-management-service-0.0.1-SNAPSHOT.jar"]