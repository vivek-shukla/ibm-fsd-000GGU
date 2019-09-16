package com.example.FSD_11_09_2019_Flight_Reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {
	@RequestMapping("/")
	public String redirectToRecipeList()
	{
		return "redirect:/receipe/list";
	}
	
	@RequestMapping("/loginPage")
	   public String redirectToFancy()
	   {
		   return "bootstrap-login";
	   }

}
