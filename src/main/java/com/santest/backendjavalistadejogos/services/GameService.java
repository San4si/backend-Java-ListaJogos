package com.santest.backendjavalistadejogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santest.backendjavalistadejogos.dto.GameMinDTO;
import com.santest.backendjavalistadejogos.entities.Game;
import com.santest.backendjavalistadejogos.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	
}
