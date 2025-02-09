package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game_list")
public class GameList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long list_id;
	private String game_id;
	private Long position;
	
	public Long getList_id() {
		return list_id;
	}
	
	public void setList_id(Long list_id) {
		this.list_id = list_id;
	}
	
	public String getGame_id() {
		return game_id;
	}
	
	public void setGame_id(String game_id) {
		this.game_id = game_id;
	}
	
	public Long getPosition() {
		return position;
	}
	
	public void setPosition(Long position) {
		this.position = position;
	}
	
}
