FROM maven:3.6.2-jdk-8-slim AS build
WORKDIR /app
COPY . .

RUN mvn -f /app/pom.xml clean package

FROM openjdk:8
COPY --from=build /app/target/love-0.0.1-SNAPSHOT.jar /app/love-app.jar

ENV testEnv test1234
CMD echo $testEnv

EXPOSE 80
ENTRYPOINT ["java","-jar","/app/love-app.jar"]