FROM openjdk:8
VOLUME /tmp
ADD ./target/worker-0.0.1-SNAPSHOT.jar worker.jar
ENTRYPOINT ["java","-jar","/worker.jar"]