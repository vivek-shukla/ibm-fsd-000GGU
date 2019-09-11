package com.example.FSD_Spring_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
//@EnableTransactionManagement
@SpringBootApplication
public class FsdSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsdSpringBootApplication.class, args);
	}

}
