package movieSpring.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import movieSpring.controller.bean.NewMovieClass;
import movieSpring.controller.bean.NewMovieDao;

import movieSpring.model.Movie;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	
	
	@GetMapping("/insert")
	public String redirectToMovieForm(Model model)
	{
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "movieForm";
	}
	
	@PostMapping("/save")
	public String saveMovieToDatabase(@ModelAttribute("movie")Movie movieObj,Model model)
	{  
		 AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ConfigurationClass.class);
	      NewMovieDao movieDao = (NewMovieDao) config.getBean("newMovieDao");
	        NewMovieClass newMovie = new NewMovieClass();
	        newMovie.setName(movieObj.getName());
	        newMovie.setDirector(movieObj.getDirector());
	        movieDao.insertMovie(newMovie); 
	        List<NewMovieClass> movieList = movieDao.fetchEmployee();
	        model.addAttribute("movieList", movieList);
		return "success";
	}
	
	@GetMapping("/viewAll")
	public String viewMovieTable(Model model)
	{ 
		 AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ConfigurationClass.class);
	      NewMovieDao movieDao = (NewMovieDao) config.getBean("newMovieDao");
	      List<NewMovieClass> movieList = movieDao.fetchEmployee();
	        model.addAttribute("movieList", movieList);
		 return "success";
		
	}
	
	@GetMapping("/delete")
	public String deleteMovie(Model model,HttpServletRequest request)
	{   AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        NewMovieDao movieDao = (NewMovieDao) config.getBean("newMovieDao");
		int id = Integer.parseInt(request.getParameter("id"));
		movieDao.deleteMovie(id);
		List<NewMovieClass> movieList = movieDao.fetchEmployee();
        model.addAttribute("movieList", movieList);
		return "success";
	}
	@GetMapping("/update")
	public String updateMovie(Model model,HttpServletRequest request)
	{
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		 NewMovieDao movieDao = (NewMovieDao) config.getBean("newMovieDao");
			int id = Integer.parseInt(request.getParameter("id"));
			NewMovieClass movieClass = new NewMovieClass();
			List<NewMovieClass> movieList = movieDao.findById(id);
			for(NewMovieClass movie:movieList)
			{
				movieClass = movie;
			}
			Movie movie = new Movie();
			movie.setName(movieClass.getName());
			movie.setDirector(movieClass.getDirector());
	        model.addAttribute("movie", movie);
			return "movieForm";
		
	}
	@GetMapping("/search")
	public String redirectToSearchPage()
	{
		
		return "searchMovie";
	}
	
	@PostMapping("/searchBy")
	public String searchBy(HttpServletRequest request)
	{
		
		return "foundMovie";
	}
	
	
	
	

}
