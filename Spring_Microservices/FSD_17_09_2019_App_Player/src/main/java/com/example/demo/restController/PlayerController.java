package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
public class PlayerController {
    @Autowired
	private PlayerService playerSerevice;
    @RequestMapping
    public String simpleResponse()
    {
    	return "player working";
    }
    @RequestMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayers()
    {
    	return ResponseEntity.ok(playerSerevice.getAllPlayer());
    }
    
    @PostMapping("/players")
    public ResponseEntity<Player> insertPlayerEntity(@RequestBody Player thePlayer)
    {
    	return ResponseEntity.ok(playerSerevice.insertPlayer(thePlayer));
    }
    
    @DeleteMapping("/players/{email}")
    public ResponseEntity<String> deleteByEmail(@PathVariable("email") String email)
    {
    	playerSerevice.deleteByEmail(email);
    	return ResponseEntity.ok("Deleted");
    	
    }
    
    @GetMapping("players/{criteria}")
    public ResponseEntity<List<Player>> findAllByCriteria(@PathVariable("criteria") String criteria)
    {
    	
    	return ResponseEntity.ok(playerSerevice.findAllByCriteria(criteria));
    }
}
