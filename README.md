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
java -Dspring.profiles.active=dev -jar target/app-SNAPSHOT-1.0.jar
```

Test Environment
```bash
java -Dspring.profiles.active=test -jar target/app-SNAPSHOT-1.0.jar
```

Prod Environment
```bash
java -Dspring.profiles.active=prod -jar target/app-SNAPSHOT-1.0.jar
```

Each setting is tailored to a specific environment.

---
#### Building the Config Server

`mvn clean compile -pl config-server`

#### Running the Config Server

`mvn spring-boot:run -pl config-server`

#### Building the sample App

`mvn clean compile -pl app`

#### Running the sample App

`mvn spring-boot:run -pl app`

### In Depth

#### The Config Server
- spring-cloud-config-server dependency is required
- spring-cloud-starter-config dependency is required
- application.yml: spring.cloud.config.server.git.uri=[git-location-of-configs]

#### The Client App
- spring-cloud-config-client dependency is required
- bootstrap.yml is required
- bootstrap.yml: spring.application.name is required
- bootstrap.yml: spring.profiles.active OR -Dspring.profiles.active is required