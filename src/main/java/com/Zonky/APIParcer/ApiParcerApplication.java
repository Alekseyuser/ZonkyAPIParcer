package com.Zonky.APIParcer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiParcerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiParcerApplication.class, args);
	}

}
