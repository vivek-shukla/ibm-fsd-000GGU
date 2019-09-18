package com.example.demo.playerService;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.responseModel.ResponseModel;

@FeignClient(name="player-service",url = "http://localhost:8762/player")
public interface PlayerService {
	
	@RequestMapping("/players")
	public List<Object> getAllPlayers();
	
	@PostMapping("players")
	public Object insertPlayer(@RequestBody ResponseModel model);
	
	@GetMapping("/players/{criteria}")
	public List<ResponseModel> findAllByCriteria(@PathVariable("criteria") String criteria);

}

