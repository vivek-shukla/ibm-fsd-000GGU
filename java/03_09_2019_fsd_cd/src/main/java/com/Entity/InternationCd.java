package com.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("International")
public class InternationCd extends CDEntity {
   private String languages;
   private String region;
   
public InternationCd() {
	super();
}

public InternationCd(String languages, String region) {
	super();
	this.languages = languages;
	this.region = region;
}

public String getLanguages() {
	return languages;
}

public void setLanguages(String languages) {
	this.languages = languages;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

   
}
