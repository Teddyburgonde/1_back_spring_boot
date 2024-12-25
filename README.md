# 1_back_spring_boot

![back](https://github.com/user-attachments/assets/2a4cb056-4c51-4188-bc23-0da6977202d3)


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


## Lancer sping boot <br>

./mvnw spring-boot:run <br>

## Configurer ma base de donnée

dans resources/application.properties  <br>
spring.application.name=crud_springboot <br>

```c
spring.datasource.url=jdbc:mysql://localhost:3306/crud_springboot
spring.datasource.username=root
spring.datasource.password=motdepasse
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false
```

#Commandes utiles pour le server 
lsof -i :8080 
kill -9 PID
