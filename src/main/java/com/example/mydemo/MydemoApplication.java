package com.example.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class MydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
	}

}
