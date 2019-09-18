package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class ImageController { 
	
	@RequestMapping("/images")
	private List<ImageClass> returnImageList()
	{
		
		List<ImageClass> imgaeList = Arrays.asList(new ImageClass(1, "image1", "image1.com"),new ImageClass(2, "image2","image.com"));
		
		return imgaeList;
	}
	

}
