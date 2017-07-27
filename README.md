# Spring Cloud Config
Spring Cloud Config proof of concept exemplifying how distributed cloud environments 
can benefit from externalizing the configuration from their applications.

#### Continuous Integration scenario
An application that is pushed through the continuous integration pipeline needs to be dynamically
configured based on the stage of the pipeline it is in. For example, if the app is at the
user acceptance testing (UAT) or performance testing phase, the app should be configured
in such a way that it does not call production dependency services. So, if the app
is dynamically deployed to a respective deployment stage, the app deployment manifest/script should
tell the app to fetch the appropriate configuration from a secure Config Server.

For example, here's a
sample launch command to a test instance that a continuous integration system might trigger:

Dev/Local Environment
```bash
java -Dspring.profiles.active=dev -jar build/libs/app-1.0.jar
```

Test Environment
```bash
java -Dspring.profiles.active=test -jar build/libs/app-1.0.jar
```

Prod Environment
```bash
java -Dspring.profiles.active=prod -jar build/libs/app-1.0.jar
```

Each setting is tailored to a specific environment.

---
#### Building the Config Server

```
./gradlew :configServer:bootRun
```

#### Building/Running the sample App

```
./gradlew :app:bootRun
```

### In Depth

#### The Config Server

- spring-cloud-config-server dependency is required
- spring-cloud-starter-config dependency is required
- application.yml: spring.cloud.config.server.git.uri=[git-location-of-configs]

#### The sample App

- bootstrap.yml is required
- bootstrap.yml: spring.application.name is required
- bootstrap.yml: spring.profiles.active OR -Dspring.profiles.active is required

# Dockerizing

Individual Dockerfile build instructions (run from root directory)
```
docker build -f app/Dockerfile --tag ddubson/app:1.0 .
docker build -f config-server/Dockerfile --tag ddubson/config-server:1.0 .
```

Simpler docker-compose 3.3 build and run instructions
```
docker-compose build
docker-compose up
```

