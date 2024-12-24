# 1_back_spring_boot

aller sur : spring initializr <br>
Selectionner Maven , java 

## Ajouter les dependances

- Spring Web
- Spring Data JPA
- MySql Driver

Telecharger le zip. 

## Installer mysql

https://dev.mysql.com/downloads/mysql/8.0.html

puis pour l'interface visuel on telecharge mysql workbench. <br>
https://dev.mysql.com/downloads/workbench/

## Commande mysql

mysql -u root -p <br>
CREATE SCHEMA nameofdatabase; <br>
SHOW DATABASES; <br>

## Configurer ma base de donnée

dans resources/application.properties  <br>

spring.datasource.url=jdbc:mysql://localhost:xxxx/crud_springboot <br>
spring.datasource.username=root <br>
spring.datasource.password=yourpassword <br>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <br>
spring.jpa.hibernate.ddl-auto=update <br>
spring.jpa.show-sql=true <br>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect <br>

