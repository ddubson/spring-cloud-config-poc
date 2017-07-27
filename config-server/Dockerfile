FROM java:openjdk-8-jdk
MAINTAINER Dmitriy Dubson <d.dubson@gmail.com>

EXPOSE 8889:8889
ADD . /opt/project
WORKDIR /opt/project
RUN ./gradlew :config-server:build -x test
ENTRYPOINT ["java", "-jar", "config-server/build/libs/config-server-1.0.jar"]