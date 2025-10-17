package com.lucave.soccer_stats_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucave.soccer_stats_api.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
