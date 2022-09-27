package com.bwgjoseph.springbootmongock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mongock.runner.springboot.EnableMongock;

@EnableMongock
@SpringBootApplication
public class SpringBootMongockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongockApplication.class, args);
	}

}
