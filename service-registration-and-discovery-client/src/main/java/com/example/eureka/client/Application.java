package com.example.eureka.client;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class Application {
	
	@RequestMapping("/")
	 public String home() {
		return "This is client 1";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
