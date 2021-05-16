package com.example.managementappfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementappfinalApplication {

	public static void main(String[] args) {

		SpringApplication.run(ManagementappfinalApplication.class, args);
		System.out.println(getHello());
	}

	private static String getHello() {
		return "Hello World !";
	}

}
