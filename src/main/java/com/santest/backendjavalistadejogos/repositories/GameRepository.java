package com.santest.backendjavalistadejogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santest.backendjavalistadejogos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
