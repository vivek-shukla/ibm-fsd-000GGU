package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceService implements SentenceInterface{
   
@Autowired WordInterface wordInterface;
	
   
	public SentenceService() {
	super();
}


	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		return  
			String.format("%s %s %s %s %s.",
					wordInterface.getSubject().getWord(),
					wordInterface.getVerb().getWord(),
					wordInterface.getArticle().getWord(),
					wordInterface.getAdjective().getWord(),
					wordInterface.getNoun().getWord() )
			;
	}	
}
