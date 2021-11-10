package com.kodluyoruz.WeekThreeSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.kodluyoruz.WeekThreeSpring.properties")
public class WeekThreeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekThreeSpringApplication.class, args);
	}

}
