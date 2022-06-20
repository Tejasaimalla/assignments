package com.zensar.project;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class Application {

	public static void main(String[] args) {
		System.out.println("Tejasai");
		SpringApplication.run(Application.class, args);
		System.out.println("Malla");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
