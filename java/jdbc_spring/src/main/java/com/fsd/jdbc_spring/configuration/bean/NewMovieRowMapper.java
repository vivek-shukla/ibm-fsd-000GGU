package com.fsd.jdbc_spring.configuration.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fsd.jdbc_spring.configuration.bean.NewMovieClass;

public class NewMovieRowMapper implements RowMapper<NewMovieClass> {

	@Override
	public NewMovieClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		NewMovieClass newMovie = new NewMovieClass(rs.getString(1),rs.getString(2));
		return newMovie;
	}

}
