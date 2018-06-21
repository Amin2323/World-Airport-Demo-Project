FROM maven:3.5-jdk-8
#MAINTAINER open-data-tu
ADD src /code/src
ADD pom.xml /code

WORKDIR /code

RUN mvn clean install




# Dependencies
#ADD target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
#CMD ["java", "-jar", "app.jar"]