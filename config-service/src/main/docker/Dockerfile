FROM java:8
WORKDIR /
VOLUME /tmp
ADD config-service-0.1.0.jar app.jar
EXPOSE 8888
CMD ["java","-jar","app.jar"]