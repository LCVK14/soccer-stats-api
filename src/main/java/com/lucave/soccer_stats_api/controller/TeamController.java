package com.lucave.soccer_stats_api.controller;

import com.lucave.soccer_stats_api.model.Team;
import com.lucave.soccer_stats_api.service.TeamService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * REST Controller for the Team entity
 */
@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {
    
    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    /**
     * Get all teams from the database
     * @return List of all teams
     */
    @GetMapping
    public List<Team> getAllTeams() {
        return service.getAllTeams();
    }

    /**
     * Add a new team to the database
     * @param team - The team to add
     * @return The added team
     */
    @PostMapping
    public Team addTeam(@RequestBody Team team) {
        return service.addTeam(team);
    }

    /**
     * Delete a team from the database by it's ID
     * @param id - The ID of the team to delete
     */
    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        service.deleteTeam(id);
    }
}
