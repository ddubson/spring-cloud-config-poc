FROM java:openjdk-8u91-jdk
MAINTAINER Dmitriy Dubson <d.dubson@gmail.com>

EXPOSE 8080:8080
ADD . /opt/sampleapp
WORKDIR /opt/sampleapp
RUN apt-get update && apt-get install -y --no-install-recommends maven
RUN mvn package
ENTRYPOINT ["java", "-jar", "target/app-1.0-SNAPSHOT.jar"]
