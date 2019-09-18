package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Word;

@FeignClient("SUBJECT")
public interface Subject {
	@GetMapping("/")
	public Word word();
}
