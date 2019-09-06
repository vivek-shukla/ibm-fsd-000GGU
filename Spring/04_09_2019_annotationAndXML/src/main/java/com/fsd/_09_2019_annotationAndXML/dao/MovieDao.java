package com.fsd._09_2019_annotationAndXML.dao;

import javax.sql.DataSource;

import com.fsd._09_2019_annotationAndXML.bean.Movie;

public class MovieDao {
  
   DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insertMovie(Movie movie)
	{
	
	}
   
}
