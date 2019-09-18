package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Word;
@FeignClient("ARTICLE")
public interface Article {
	@GetMapping("/")
	public Word word();
}
