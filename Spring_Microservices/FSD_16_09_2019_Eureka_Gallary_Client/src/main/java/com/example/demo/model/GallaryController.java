package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class GallaryController { 
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String responseStatus()
	{
		return "ok";
	}
	@RequestMapping("/galary")
	private Gallary returnGalary()
	{
		Gallary g = new Gallary();
		g.setId(1);
		
		@SuppressWarnings("unchecked")
		List<Object> listImage = restTemplate.getForObject("http://eureka-image/images", List.class);
		
		g.setListImages(listImage);
		return g;
	}

}
