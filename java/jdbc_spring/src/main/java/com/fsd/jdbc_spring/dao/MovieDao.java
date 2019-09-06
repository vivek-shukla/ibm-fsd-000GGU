package com.fsd.jdbc_spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.fsd.jdbc_spring.bean.Movie;

public class MovieDao {
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insertMovie(Movie movie) throws SQLException
	{
		Connection connectionObj = dataSource.getConnection();
		PreparedStatement pst = connectionObj.prepareStatement("insert into movie(name,director) values(?,?)");
		pst.setString(1,movie.getName());
		pst.setString(2, movie.getDirector());
		pst.executeUpdate();
		
	}

}
