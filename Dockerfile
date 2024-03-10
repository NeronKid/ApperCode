FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV DB_USERNAME=USER
ENV DB_PASSWORD=PASSWORD
ENV DB_NAME=avito_hackathon_db
ENV DB_HOST=localhost
ENV DB_PORT=5432
ENV APP_PORT=8080
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.datasource.password=${DB_PASSWORD}", "-Dspring.datasource.username=${DB_USERNAME}", "-Dspring.datasource.url=jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}", "-Dserver.port=${APP_PORT}", "-jar", "app.jar"]