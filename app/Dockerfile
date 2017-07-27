FROM java:openjdk-8-jdk
MAINTAINER Dmitriy Dubson <d.dubson@gmail.com>

EXPOSE 8080:8080
ADD . /opt/project
WORKDIR /opt/project
RUN chmod +x gradlew
RUN ./gradlew :app:build -x test
ENTRYPOINT ["java", "-jar", "app/build/libs/app-1.0.jar"]
