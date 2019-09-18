package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Adjective;
import com.example.demo.dao.Article;
import com.example.demo.dao.Noun;
import com.example.demo.dao.Subject;
import com.example.demo.dao.Verb;
import com.example.demo.model.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class WordService implements WordInterface {
	public WordService() {
		super();
	}
	@Autowired
    private Subject subject;
	@Autowired
    private Noun noun;
	@Autowired
    private Adjective adjective;
	@Autowired
    private Article article;
	@Autowired
    private Verb verb;
	
	@HystrixCommand(fallbackMethod = "fallbackSubject")
	public Word getSubject()
	{
		return subject.word();
	}
	@HystrixCommand(fallbackMethod = "fallbackVerb")
	public Word getVerb()
	{
		return verb.word();
	}
	@HystrixCommand(fallbackMethod = "fallbackNoun")
	public Word getNoun()
	{
		return noun.word();
	}
	@HystrixCommand(fallbackMethod = "fallbackArticle")
	public Word getArticle()
	{
		return article.word();
	}
	
	public Word getAdjective()
	{
		return adjective.word();
	}
	public Word fallbackSubject()
	{
		return adjective.word();
	}
	public Word fallbackVerb()
	{
		return adjective.word();
	}
	public Word fallbackNoun()
	{
		return adjective.word();
	}
	public Word fallbackArticle()
	{
		return adjective.word();
	}
	
	
}
