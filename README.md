# Spring Boot Flyway Sample

All credit goes to https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-flyway
This builds upon that to also show a Java-based Flyway db.migration and other handy items.

This currently uses a localhost mysql server to work in order to demonstrate different types of migrations (versioned and repeatable).
On Mac OSX, you can use homebrew to instal mysql: `brew install mysql`. You'll also want to run `mysql_secure_installation` and enter `myrootpw` for the password, then answer yes to all the questions.

Taken from Spring Boot repo's readme:
```
This sample demonstrates the flyway auto-configuration support.
You can look at http://localhost:8080/flyway to review the list of scripts.
This sample also enables the H2 console (at http://localhost:8080/h2-console) so that you can review the state of the database (the default jdbc url is jdbc:h2:mem:testdb).
```