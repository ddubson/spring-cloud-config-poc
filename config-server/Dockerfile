FROM java:openjdk-8u91-jdk
MAINTAINER Dmitriy Dubson <d.dubson@gmail.com>

EXPOSE 8888:8888
ADD . /opt/configserver
WORKDIR /opt/configserver
RUN apt-get update && apt-get install -y --no-install-recommends maven
RUN mvn package
ENTRYPOINT ["java", "-jar", "target/config-server-1.0-SNAPSHOT.jar"]