FROM openjdk:11
MAINTAINER mayannap
COPY target/exercicio1-0.0.1-SNAPSHOT.jar exercicio1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/exercicio1-0.0.1-SNAPSHOT.jar"]
