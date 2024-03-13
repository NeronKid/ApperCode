FROM meddream/jdk17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.datasource.password=${DB_PASSWORD}", "-Dspring.datasource.username=${DB_USERNAME}", "-Dspring.datasource.url=jdbc:postgresql://${POSTGRES_SERVER}:${DB_PORT}/${POSTGRES_DB}", "-Dserver.port=${APP_PORT}", "-jar", "app.jar"]