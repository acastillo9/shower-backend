FROM openjdk:8
ADD target/Shower.jar Shower.jar
EXPOSE 8091
ENTRYPOINT ["java","-Dspring.profiles.active=pdn", "-jar", "Shower.jar"]