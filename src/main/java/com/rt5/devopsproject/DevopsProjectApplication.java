package com.rt5.devopsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DevopsProjectApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!89");
		SpringApplication.run(DevopsProjectApplication.class, args);
	}

}
