package com.example.demo.productController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.Product;

@RestController
public class ProductController {
  
	private static List<Product> productList = new ArrayList<Product>();
	static {
		productList.add(new Product(1, "Tik tac", 50));
		productList.add(new Product(2,"lays", 20));
	}
	@RequestMapping("/products")
	public ResponseEntity<?> getAllProduct()
	{
		
		return ResponseEntity.ok(productList);
		
	}
	@RequestMapping("/products/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id)
	{
		Product p = (Product) productList.stream().filter(product -> product.getId()==id);
				
			return ResponseEntity.ok(p);	
				
	}
	
	
}
