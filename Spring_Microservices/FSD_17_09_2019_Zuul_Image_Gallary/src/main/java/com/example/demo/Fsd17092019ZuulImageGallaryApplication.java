package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Fsd17092019ZuulImageGallaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fsd17092019ZuulImageGallaryApplication.class, args);
	}

}
