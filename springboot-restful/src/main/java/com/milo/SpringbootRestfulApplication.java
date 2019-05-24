package com.milo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringbootRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulApplication.class, args);
	}

}
