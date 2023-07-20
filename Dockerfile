FROM openjdk:17-alpine
ADD build/libs/xpanel-0.0.1-SNAPSHOT.jar xpanel.jar
ENTRYPOINT ["java","-jar","xpanel.jar","--spring.profiles.active=prod"]
