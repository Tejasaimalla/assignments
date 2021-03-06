package com.zensar.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "test", "com.zensar" })
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Ram");

		SpringApplication.run(SpringBootDemoApplication.class, args);

		System.out.println("Laxman");
	}

}
