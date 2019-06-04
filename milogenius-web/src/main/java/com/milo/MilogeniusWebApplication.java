package com.milo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MilogeniusWebApplication {

	public static void main(String[] args) {
		//关闭热部署
		//System.setProperty("spring.devtools.restart.enabled","false");
		SpringApplication.run(MilogeniusWebApplication.class, args);
	}

}
