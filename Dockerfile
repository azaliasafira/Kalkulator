FROM openjdk:8-jdk-alpine
MAINTAINER azaliasafira <azaliafira16@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY main.java /app

#compile file java
RUN javac main.java

#running java
CMD ["java","main"]
