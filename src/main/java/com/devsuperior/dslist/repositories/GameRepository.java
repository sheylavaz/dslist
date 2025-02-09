package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//camada de acesso aos dados, já faz varias requisições no banco

public interface GameRepository extends JpaRepository<Game, Long>{

}
