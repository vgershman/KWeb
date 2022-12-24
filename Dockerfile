FROM gradle:7.6.0-jdk17
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
EXPOSE 8080
CMD ["sleep", "1m"]
CMD ["gradle", "run"]
#CMD ["sleep", "infinity"]