FROM java:8
WORKDIR /
VOLUME /tmp
ADD discovery-service-0.1.0.jar app.jar
EXPOSE 8761
CMD ["java","-jar","app.jar"]