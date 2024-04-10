FROM openjdk:17-jdk-alpine
ARG JAR_FILE=./target/githubActionDemo-0.0.1-SNAPSHOT.jar
COPY ./target/githubActionDemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
