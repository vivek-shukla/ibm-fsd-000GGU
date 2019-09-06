package movie_spring_mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
private String name,genre,director;
private static List<Movie> movieList;
static
{
	movieList = new ArrayList<Movie>();
}
public Movie() {
	super();
}

public Movie(String name, String genre, String director) {
	super();
	this.name = name;
	this.genre = genre;
	this.director = director;
}

public static void addToList(Movie movie)
{
	movieList.add(movie);
}

public static List<Movie> getMovieList() {
	return movieList;
}

public static void setMovieList(List<Movie> movieList) {
	Movie.movieList = movieList;
}

@Override
public String toString() {
	return "Movie [name=" + name + ", genre=" + genre + ", director=" + director + "]";
}



}
