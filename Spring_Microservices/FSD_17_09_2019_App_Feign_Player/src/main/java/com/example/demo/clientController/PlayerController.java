package com.example.demo.clientController;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.playerService.PlayerService;
import com.example.demo.responseModel.ResponseModel;

@Controller
@RequestMapping("/")
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/")
	public String redirectToHome()
	{
		return "home";
	}
	
	
	@RequestMapping("/player")
	public String getAllPlayer(Model theModel)
	{
		List<Object> oList = playerService.getAllPlayers();
		ModelMapper mapper = new ModelMapper();
		List<ResponseModel> playerResponseList = new ArrayList<ResponseModel>();
		for(Object o:oList)
		{
			playerResponseList.add(mapper.map(o, ResponseModel.class));
			
		}
		
		theModel.addAttribute("playerList",playerResponseList);
		return "playerList";
	}
	@GetMapping("/showPlayerForm")
	public String redirectToPlayerForm(Model theModel)
	{  
		theModel.addAttribute("player", new ResponseModel());
		return "playerForm";
	}
	@PostMapping("/playerSave")
	public String playerSave(@ModelAttribute("player") ResponseModel theModel)
	{
		playerService.insertPlayer(theModel);
		
		return "redirect:/player";
	}
	
	@PostMapping("/findBy")
	public String findAllByCriteria(@RequestParam("criteria") String criteria,Model theModel)
	{
		List<ResponseModel> playerResponseList = playerService.findAllByCriteria(criteria);
		theModel.addAttribute("playerList",playerResponseList);
		return "playerList";
	}

}
