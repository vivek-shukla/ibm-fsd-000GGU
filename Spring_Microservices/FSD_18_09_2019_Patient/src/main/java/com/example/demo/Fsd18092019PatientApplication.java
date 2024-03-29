package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Fsd18092019PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fsd18092019PatientApplication.class, args);
	}

}
