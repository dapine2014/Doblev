FROM amazoncorretto:21.0.0

ENV TZ=America/Bogota
VOLUME /tmp
COPY /target/Ticket-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
#CMD ["java","-jar","locationsApi.jar"]
CMD ["java","-jar","Ticket-0.0.1-SNAPSHOT.jar" ,"--spring.config.name=application-prod"]