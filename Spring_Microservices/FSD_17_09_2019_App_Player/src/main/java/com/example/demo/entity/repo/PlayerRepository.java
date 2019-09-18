package com.example.demo.entity.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
   
	public List<Player> findAllByFirstNameOrLastNameOrEmail(String criteria,String ctr,String ctr2);
	public void deleteByEmail(String email);
}
