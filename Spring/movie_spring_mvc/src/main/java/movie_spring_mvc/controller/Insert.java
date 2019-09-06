package movie_spring_mvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/insertController")
public class Insert {
	@GetMapping("/")
	public String redirectToMovieForm()
	{
		return "movieForm";
	}
	
	

}
