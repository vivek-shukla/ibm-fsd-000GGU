package movieSpring.controller.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import movieSpring.controller.bean.NewMovieClass;

public class NewMovieRowMapper implements RowMapper<NewMovieClass> {

	
	public NewMovieClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		NewMovieClass newMovie = new NewMovieClass(rs.getString(2),rs.getString(3));
		newMovie.setId(rs.getInt(1));
		return newMovie;
	}

	

}
