# 빌드 스테이지
FROM bellsoft/liberica-openjdk-alpine:17 AS builder
# or
# FROM openjdk:8-jdk-alpine
# FROM openjdk:11-jdk-alpine

RUN ["./gradlew", "clean", "build"]
# or Maven
# RUN ["./mvnw", "clean", "package"]

VOLUME /tmp

ARG JAR_FILE_PATH=build/libs/*.jar
# or Maven
# ARG JAR_FILE_PATH=target/*.jar

COPY ${JAR_FILE} app.jar

# 실행 스테이지
FROM nginx:stable-alpine

COPY --from=builder app.jar /app.jar

COPY ./config/nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
