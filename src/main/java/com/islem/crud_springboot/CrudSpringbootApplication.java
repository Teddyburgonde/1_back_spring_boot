package com.islem.crud_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.islem.crud_springboot") 
public class CrudSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringbootApplication.class, args);
	}

}
