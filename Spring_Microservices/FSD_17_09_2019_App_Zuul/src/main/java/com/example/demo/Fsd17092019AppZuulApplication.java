package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Fsd17092019AppZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fsd17092019AppZuulApplication.class, args);
	}

}
