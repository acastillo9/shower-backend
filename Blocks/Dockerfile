FROM openjdk:8
ADD target/Blocks.jar Blocks.jar
EXPOSE 8091
ENTRYPOINT ["java","-Dspring.profiles.active=pdn", "-jar", "Blocks.jar"]