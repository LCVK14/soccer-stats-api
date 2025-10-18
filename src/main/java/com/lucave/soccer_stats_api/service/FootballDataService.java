package com.lucave.soccer_stats_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FootballDataService {

    private final WebClient webClient;

    public FootballDataService(@Value("${football.api.url}") String baseUrl,
            @Value("${football.api.key}") String apiKey) {

        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("X-Auth-Token", apiKey)
                .build();
    }

    public List<String> getPremierLeagueTeams() {
        try {
            Mono<Map<String, Object>> response = webClient.get()
                    .uri("/competitions/PL/teams")
                    .retrieve()
                    .bodyToMono(new org.springframework.core.ParameterizedTypeReference<Map<String, Object>>() {
                    });

            Map<String, Object> data = response.block();

            @SuppressWarnings("unchecked")
            List<Map<String, Object>> teams = (List<Map<String, Object>>) data.get("teams");

            List<String> teamNames = new ArrayList<>();
            for (Map<String, Object> teamEntry : teams) {
                teamNames.add((String) teamEntry.get("name"));
            }

            return teamNames;

        } catch (Exception e) {
            // Return a helpful error message instead of crashing
            return List.of("Error: " + e.getMessage());
        }
    }
}
