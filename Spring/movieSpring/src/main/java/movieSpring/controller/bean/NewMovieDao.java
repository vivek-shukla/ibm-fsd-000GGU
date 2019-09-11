package movieSpring.controller.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import movieSpring.controller.bean.NewMovieClass;


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
	public void deleteMovie(int id)
	{
		String query="delete from movie where id=?";
		Object obj[]= {id};
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
	public List<NewMovieClass> findById(int id)
	{   
		Object obj[] = {id};
		return jdbcClass.query("select * from movie where id=? ",obj, new NewMovieRowMapper());
	}
	public List<NewMovieClass> searchBy(String searchCriteria)
	{   
		Object obj[] = {searchCriteria, searchCriteria};
		return jdbcClass.query("select * from movie where name like '%?%' or director like '%?%'",obj, new NewMovieRowMapper());
	}
	

	
}
