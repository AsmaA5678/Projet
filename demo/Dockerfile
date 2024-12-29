FROM amazoncorretto:21 AS builder

RUN yum update -y && yum install -y tar gzip

WORKDIR /app

COPY .  .

RUN ./mvnw clean package -DskipTests

FROM amazoncorretto:21

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
