FROM gradle:7-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle browserRun --no-daemon

#FROM openjdk:11
#EXPOSE 8080:8080
#RUN mkdir /app
#COPY --from=build /home/gradle/src/build/libs/*.jar /app/ktor-docker-sample.jar
#ENTRYPOINT ["java","-jar","/app/ktor-ddocker build -t whalesupinfo -f /path/to/Dockerfile ocker-sample.jar"]