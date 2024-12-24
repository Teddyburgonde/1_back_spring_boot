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

dans resources/application.properties 

spring.datasource.url=jdbc:mysql://localhost:xxxx/crud_springboot
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

