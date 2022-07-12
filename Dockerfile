#define base docker image
FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/MicTest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} MicTest.jar
ENTRYPOINT ["java","-jar","/MicTest.jar"]
