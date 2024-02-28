package com.example.demo.SwaggerOpenApi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@OpenAPIDefinition
@EnableConfigurationProperties
@EnableCaching
@Configuration
public class SwaggerOpenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerOpenApiApplication.class, args);
	}

}