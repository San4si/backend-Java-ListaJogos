package com.santest.backendjavalistadejogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santest.backendjavalistadejogos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
