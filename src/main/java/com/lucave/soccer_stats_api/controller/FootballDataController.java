package com.lucave.soccer_stats_api.controller;

import com.lucave.soccer_stats_api.service.FootballDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/football")
public class FootballDataController {
    
    private final FootballDataService service;

    public FootballDataController(FootballDataService service) {
        this.service = service;
    }

    @GetMapping("/premier-league-teams")
    public List<String> getPremierLeagueTeams() {
        return service.getPremierLeagueTeams();
    }
    
    @GetMapping("/test")
    public Map<String, Object> testEndpoint() {
        return Map.of(
            "status", "success",
            "message", "Football Data API is working!",
            "timestamp", System.currentTimeMillis()
        );
    }
}
