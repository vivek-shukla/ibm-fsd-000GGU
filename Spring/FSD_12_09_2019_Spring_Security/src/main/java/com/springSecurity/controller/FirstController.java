package com.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
	@RequestMapping("/")
  public String showHome() {
		
		return "home";
	}
	@RequestMapping("/loginPage")
   public String redirectToFancy()
   {
	   return "bootstrap-login";
   }
}
