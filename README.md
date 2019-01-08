A simple Spring Boot project to show that AspectJ + Lombok does work with `mvn` but not within IntelliJ:

# Works
```bash
$ mvn package -DskipTests && mvn spring-boot:run
```
or
```
$ mvn package -DskipTests && java -jar target/spring-boot-ctw-0.0.1-SNAPSHOT.jar
```

# Does not work
Run the project from within IntelliJ
```bash
Error:(18, 0) ajc: log cannot be resolved
```

# Remarks
- Code copied from https://github.com/dsyer/spring-boot-aspectj/tree/master/ctw
- "Hack" applied from https://palesz.wordpress.com/2011/12/03/howto-maven-lombok-and-aspectj-together/
