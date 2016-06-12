# Spring Cloud Config
Spring Cloud Config proof of concept exemplifying how distributed cloud environments 
can benefit from externalizing configuration of the applications.

#### Sample scenario
An application that is pushed through the continuous integration pipeline needs to be dynamically
configured based on the stage of the pipeline it is in. For example, if the app is at the
user acceptance testing (UAT) or performance testing phase, the app should be configured
in such a way that it does not call production dependency services. So, if the app
is dynamically deployed to a respective deployment stage, the app deployment manifest/script should
tell the app to fetch the appropriate configuration from a secure Config Server. Enter Spring Cloud Config!

More details to follow.

---
#### Building the Config Server

Run: `mvn clean compile -pl config-server`

#### Running the Config Server

Run: `mvn spring-boot:run -pl config-server`

#### Building the sample App

Run: `mvn clean compile -pl app`

#### Running the sample App

Run: `mvn spring-boot:run -pl app`