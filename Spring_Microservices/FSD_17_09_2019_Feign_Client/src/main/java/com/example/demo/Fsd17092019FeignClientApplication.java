package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Fsd17092019FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fsd17092019FeignClientApplication.class, args);
	}

}
