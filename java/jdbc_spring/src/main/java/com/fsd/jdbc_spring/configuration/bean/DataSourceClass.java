package com.fsd.jdbc_spring.configuration.bean;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

@Component("dataSourceClass")
public class DataSourceClass extends BasicDataSource {
	
	
	public DataSourceClass() {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
    private void post_constructor()
    {
    	this.setUrl("jdbc:mysql://localhost:3306/HibernateFsd");
    	this.setUsername("root");
    	this.setPassword("Vivek@1997");
    
    }

}
