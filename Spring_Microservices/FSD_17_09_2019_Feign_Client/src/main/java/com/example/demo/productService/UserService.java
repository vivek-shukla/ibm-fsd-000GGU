package com.example.demo.productService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "dto-service")
public interface UserService { 
	@RequestMapping("/users")
	public Object getAllUser();

}
