package spring_webapp_05_09_2019.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
 
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	
}
