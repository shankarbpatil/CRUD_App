FROM openjdk:17
COPY target/CRUD_App.jar CRUD_App.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "CRUD_App.jar"]