package movie_spring_mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import movie_spring_mvc.model.Movie;

@Controller
@RequestMapping("/saveMovie")
public class Save {

	
	@RequestMapping(method = RequestMethod.POST,name = "/saveMovie")
	public String InsertAndRedirectToHomePage(HttpServletRequest request,@RequestParam("name") String name,@RequestParam("genre") String genre,@RequestParam("director")String director,Model theMOdel)
	{
		Movie movieObj = new Movie(name, genre, director);
		
		Movie.addToList(movieObj);
		
		HttpSession session = request.getSession();
		session.setAttribute("movieList", Movie.getMovieList());
		
		return "home";
	}
}
