package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

//camada de acesso aos dados, já faz varias requisições no banco
public interface GameListRepository extends JpaRepository<GameList,Long>{

}
