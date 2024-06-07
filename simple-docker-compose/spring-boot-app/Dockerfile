FROM bellsoft/liberica-openjdk-alpine:17
# or
# FROM openjdk:8-jdk-alpine
# FROM openjdk:11-jdk-alpine

CMD ["./gradlew", "clean", "build"]
# or Maven
# CMD ["./mvnw", "clean", "package"]

VOLUME /tmp

ARG JAR_FILE_PATH=build/libs/*.jar
# or Maven
# ARG JAR_FILE_PATH=target/*.jar

COPY ${JAR_FILE_PATH} app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app.jar"]