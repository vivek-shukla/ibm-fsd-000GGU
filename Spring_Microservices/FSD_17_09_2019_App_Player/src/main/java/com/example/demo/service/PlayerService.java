package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Player;

public interface PlayerService {
 
	public List<Player> getAllPlayer();
	public Player insertPlayer(Player playerObj);
	public List<Player> findAllByCriteria(String Criteria);
	public void deleteByEmail(String email);
}
