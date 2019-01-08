A simple Spring Boot project to show that AspectJ + Lombok does work with `mvn` but not within IntelliJ:

# Works
```bash
$ mvn package -DskipTests && mvn spring-boot:run
```
or
```
mvn package -DskipTests && java -jar target/spring-boot-ctw-0.0.1-SNAPSHOT.jar
```

# Does not work
Run the project from within IntelliJ
```bash
Error:(18, 0) ajc: log cannot be resolved
```