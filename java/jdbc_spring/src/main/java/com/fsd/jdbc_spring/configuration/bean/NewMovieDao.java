package com.fsd.jdbc_spring.configuration.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fsd.jdbc_spring.bean.Movie;

import com.fsd.jdbc_spring.configuration.bean.NewMovieClass;


@Component("newMovieDao")
public class NewMovieDao {
	@Autowired
	JdbcClass jdbcClass;

	
	public void insertMovie(NewMovieClass newMovie)
	{
		String query="insert into movie(name,director) values(?,?)";
		Object obj[]= {newMovie.getName(),newMovie.getDirector()};
		jdbcClass.update(query,obj);
		System.out.println("done");
	}
	public void deleteMovie(String  s)
	{
		String query="delete from movie where name=? or director=?";
		Object obj[]= {s,s};
		jdbcClass.update(query,obj);
		System.out.println("deleted");
	}
	public void update(NewMovieClass newMovie)
	{
		String query="update movie set name=?,director=? where id=?";
		Object obj[]= {newMovie.getName(),newMovie.getDirector(),newMovie.getId()};
		jdbcClass.update(query,obj);
		System.out.println("updated");
		
	}
	public List<NewMovieClass> fetchEmployee()
	{
		return jdbcClass.query("select * from movie", new NewMovieRowMapper());
	}

	
}
