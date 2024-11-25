package com.example.fleetmsv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.fleetmsv2.entities")
public class Fleetmsv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Fleetmsv2Application.class, args);
	}

}
