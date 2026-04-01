FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY TestingJenkins/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]