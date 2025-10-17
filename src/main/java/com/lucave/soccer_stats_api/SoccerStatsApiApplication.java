package com.lucave.soccer_stats_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the Soccer Stats API
 * Starts the Spring Boot application and loads the necessary beans
 */
@SpringBootApplication
public class SoccerStatsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoccerStatsApiApplication.class, args);
	}
}
