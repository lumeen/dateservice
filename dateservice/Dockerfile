FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/dateservice-*.jar dateservice.jar
ENTRYPOINT ["java","-jar","dateservice.jar"]

