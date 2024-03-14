FROM meddream/jdk17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.datasource.password=admin", "-Dspring.datasource.username=admin", "-Dspring.datasource.url=jdbc:postgresql://localhost:15432/app_db", "-Dserver.port=80", "-jar", "app.jar"]