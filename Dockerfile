FROM openjdk:11
COPY ./target/seMethods-0.1.0.6-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods-0.1.0.6-jar-with-dependencies.jar"]