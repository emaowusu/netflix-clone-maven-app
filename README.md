# SIMPLE SPRING-BOOT JAVA-BASED NETFLIX-CLONE PROJECT

## PREREQUISITE
### INSTALL THE TOOLS BELOW ON YOU LOCAL MACHINE
1. Maven
2. Docker
3. Kubernetes-cli
4. Helm
5. Kind/Minikube

## How TO RUN THE APPLICATION
1. ### RUN THE `mvn` COMMAND ON YOUR TERMINAL
```bash
mvn spring-boot:run
```

2. ### ACCESS THE APPLICATION ON THE WEB BROWSER
```bash
http://localhost:8080
````

## BUILD `.jar` TO CREATE DEPLOYABLE APP

1. ### RUN THIS `mvn` COMMAND TO CREATE THE DEPLOYABLE APP

```bash
mvn clean package
```

2. ### RUN THIS COMMAND

```bash
java -jar target/netflix_clone_app-0.0.1-SNAPSHOT.jar
````

3. ### REMOVE THE DEPLOYABLE APP
```bash
mvn clean
```

## DOCKERIZE THE APPLICATION

```bash
# Build the image
docker build -t springboot-tomcat-app .
```
```bash
# Run container (read-only)
docker run -d --name myapp -p 8080:8080 --read-only springboot-tomcat-app
```