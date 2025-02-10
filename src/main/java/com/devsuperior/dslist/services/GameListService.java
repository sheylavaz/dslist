package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;



//@Service faz a "msm coisa" que o @Component ver a diferença deles
@Service
public class GameListService {

	@Autowired //injetando umas instania da e GameListRepository dentro do GameListService
	private GameListRepository gameListRepository;
	
	//retorna lista compacta das informações dos games
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();		
	}
	
}
