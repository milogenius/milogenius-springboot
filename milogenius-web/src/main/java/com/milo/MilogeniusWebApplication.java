package com.milo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MilogeniusWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilogeniusWebApplication.class, args);
	}

}
