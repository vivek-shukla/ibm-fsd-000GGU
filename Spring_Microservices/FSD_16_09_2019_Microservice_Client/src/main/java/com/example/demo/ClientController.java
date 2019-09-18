package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientController {
	@Value("${lucky}")
	private String luckyWords;
	
	@RequestMapping("/")
	public String returnResponse()
	{
		return luckyWords;
	}

	public String getLuckyWords() {
		return luckyWords;
	}

	public void setLuckyWords(String luckyWords) {
		this.luckyWords = luckyWords;
	}

	
	
	
	

}
