package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		//crear y almacenar un coche en base de datos

		Coche toyota = new Coche(null, 2015,"Prius", "Toyota" );
		repository.save(toyota);
	}

}
