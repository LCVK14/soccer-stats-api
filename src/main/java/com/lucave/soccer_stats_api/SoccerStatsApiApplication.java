package com.lucave.soccer_stats_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lucave")
public class SoccerStatsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoccerStatsApiApplication.class, args);
	}
}
