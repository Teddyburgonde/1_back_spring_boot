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

```c
mysql -u root -p <br>
CREATE SCHEMA nameofdatabase; <br>
SHOW DATABASES; <br>
USE name_table;
SELECT * FROM name_tables;
```

## Lancer sping boot <br>

./mvnw spring-boot:run <br>

## Nettoyer target
```c
./mvnw clean <br>
```
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

## Creation d'un modèle 

```cpp
package com.cwa.crudspringboot;

import javax.persistence.Entity;

@Entity
@Table(name = "persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String city;
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
```

## 3 Étapes :

```c
1. Crée un modèle.
2. Créer un repository (interface) pour accéder aux données du modèle.
3. Creer un controler.
4. Utiliser le repository dans un service pour ajouter la logique métier.
``` 


## Commandes utiles pour le server 
lsof -i :8080 
kill -9 PID

## Etapes pas a pas : 

1. Dans application.properties on configure la database. <br>
2. Création d'un classe. Elle represente une table dans la base de données. <br>
3. Création d'une interface. Cette interface permet d'utiliser JpaRepository (pour les methodes prêtes à l'emploi (findALl etc...).  <br>
4. Création d'un contrôleur. Il utilise TaskRepository pour interagir avec la data base. <br>
exemple :
```c
  @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
```
5. A ce stade la table et vide donc on insére des données dans la table <br>
```c
INSERT INTO tasks (title, description, is_completed)
VALUES 
('Acheter du lait', 'Aller au supermarché', false),
('Revoir Angular', 'Étudier les services', true),
('Faire du sport', 'Courir 30 minutes', false);
```

# Ressources :

https://www.youtube.com/watch?v=Ey554n5odLk
dans le resources/application.properties






