FROM openjdk:8
VOLUME /tmp
ADD ./target/payroll-0.0.1-SNAPSHOT.jar payroll.jar
ENTRYPOINT ["java","-jar","/payroll.jar"]