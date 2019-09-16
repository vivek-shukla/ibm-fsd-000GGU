package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Fsd16092019MicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fsd16092019MicroserviceApplication.class, args);
	}

}
