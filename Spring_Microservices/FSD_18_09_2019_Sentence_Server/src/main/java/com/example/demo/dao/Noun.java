package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Word;
@FeignClient("NOUN")
public interface Noun {
	@GetMapping("/")
	public Word word();
}
