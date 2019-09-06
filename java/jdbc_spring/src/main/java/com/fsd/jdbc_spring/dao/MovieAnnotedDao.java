package com.fsd.jdbc_spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fsd.jdbc_spring.bean.Movie;

@Component
public class MovieAnnotedDao {
	@Autowired
	JdbcTemplate jTemplateRef;

	public JdbcTemplate getjTemplate() {
		return jTemplateRef;
	}

	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplateRef = jTemplate;
	}
	
	public void insertMovie(Movie movie)
	{
		String query="insert into movie(name,director) values(?,?)";
		Object obj[]= {movie.getName(),movie.getDirector()};
		jTemplateRef.update(query,obj);
		System.out.println("done");
	}
	public void deleteMovie(String  s)
	{
		String query="delete from movie where name=? or director=?";
		Object obj[]= {s,s};
		jTemplateRef.update(query,obj);
		System.out.println("deleted");
	}
	public void update(Movie movie)
	{
		String query="update movie set name=?,director=? where id=?";
		Object obj[]= {movie.getName(),movie.getDirector(),movie.getId()};
		jTemplateRef.update(query,obj);
		System.out.println("updated");
		
	}
	

}
