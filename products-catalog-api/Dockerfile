FROM adoptopenjdk/openjdk11:alpine
RUN mkdir /app
WORKDIR /app
COPY build/libs/products-catalog-api.jar /app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/products-catalog-api.jar"]