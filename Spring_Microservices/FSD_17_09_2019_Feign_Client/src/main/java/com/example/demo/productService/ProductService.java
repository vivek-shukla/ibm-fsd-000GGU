package com.example.demo.productService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service")
public interface ProductService {
 
	@RequestMapping("/products")
	public Object getAllProduct();
}
