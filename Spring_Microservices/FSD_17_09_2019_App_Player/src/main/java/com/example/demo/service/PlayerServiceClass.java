package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.entity.repo.PlayerRepository;
@Service
public class PlayerServiceClass implements PlayerService {
   @Autowired
	private PlayerRepository playerRepository;
	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public Player insertPlayer(Player playerObj) {
		// TODO Auto-generated method stub 
		playerRepository.save(playerObj);
		return playerObj;
	}

	@Override
	public List<Player> findAllByCriteria(String Criteria) {
		// TODO Auto-generated method stub
		return playerRepository.findAllByFirstNameOrLastNameOrEmail(Criteria,Criteria,Criteria);
	}

	@Override
	public void deleteByEmail(String email) {
		// TODO Auto-generated method stub
		playerRepository.deleteByEmail(email);
	}

}
