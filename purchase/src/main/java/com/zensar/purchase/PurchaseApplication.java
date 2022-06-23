package com.zensar.purchase;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
@OpenAPIDefinition
public class PurchaseApplication {

	public static void main(String[] args) {
		System.out.println("Free Coupon");

		SpringApplication.run(PurchaseApplication.class, args);
		System.out.println("Coupons are ready to expire..");

	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
