package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Word;
@FeignClient("VERB")
public interface Verb {
	@GetMapping("/")
	public Word word();
}
