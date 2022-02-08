FROM adoptopenjdk/openjdk11:ubi

ARG JAR_FILE=/target/Feedback-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} myapp.jar

EXPOSE 8086

ENTRYPOINT ["java","-jar" , "/myapp.jar"]

