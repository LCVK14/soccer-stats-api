package com.lucave.soccer_stats_api.service;

import com.lucave.soccer_stats_api.model.Team;
import com.lucave.soccer_stats_api.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service talks to the repository layer
 */
@Service
public class TeamService {
    
    private final TeamRepository repo;

    public TeamService(TeamRepository repo) {
        this.repo = repo;
    }

    /**
     * Retrieve all teams from the database
     * @return List of all teams
     */
    public List<Team> getAllTeams() {
        return repo.findAll();
    }

    /**
     * Add a new Team to the database
     * @param team - The team to add
     * @return The added team
     */
    public Team addTeam(Team team) {
        return repo.save(team);
    }

    /**
     * Delete a team from the database by it's ID
     * @param id - The ID of the team to delete
     */
    public void deleteTeam(Long id) {
        repo.deleteById(id);
    }
    
}
