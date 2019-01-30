package com.copeik.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class RestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFullApplication.class, args);
	}

}

