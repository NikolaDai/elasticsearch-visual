package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class VisualApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualApplication.class, args);
	}
}
