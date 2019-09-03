package com.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SpecialEdition")
public class SpecialEdition extends CDEntity { 
	String new_features;

	public SpecialEdition(String new_features) {
		super();
		this.new_features = new_features;
	}

	public SpecialEdition() {
		super();
	}

	public String getNew_features() {
		return new_features;
	}

	public void setNew_features(String new_features) {
		this.new_features = new_features;
	}
	

}
