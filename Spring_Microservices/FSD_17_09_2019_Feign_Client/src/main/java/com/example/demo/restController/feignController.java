package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productService.ProductService;
import com.example.demo.productService.UserService;

@RestController
public class feignController {
	@Autowired
	private ProductService productService;
	@Autowired
	private UserService userService;
	@RequestMapping("/product")
	public ResponseEntity<?> getAllProduct()
	{
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	@RequestMapping("/users")
	public ResponseEntity<?> getAllUser()
	{
		return ResponseEntity.ok(userService.getAllUser());
	}

}
