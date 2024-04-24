FROM openjdk:17
EXPOSE 8081
COPY src/main/resources src/main/resources
ARG JAR_FILE=target/data-wrangling-services-0.0.1.jar
COPY ${JAR_FILE} datawrangling.jar
ENTRYPOINT ["java","-jar","/datawrangling.jar"]