package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BootProj1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj1Application.class, args);
	
		MyApp app = ctx.getBean("cm",MyApp.class);
		
		System.out.println("My Data is "+app);
	
	}

}
