package com.example.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootCrudDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudDemoApplication.class, args);
	}

}
