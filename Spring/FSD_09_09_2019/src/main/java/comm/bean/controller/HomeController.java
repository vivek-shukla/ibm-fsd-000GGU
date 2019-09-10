package comm.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   
	@RequestMapping("/")
	public String redirectToIndex() {
    	return "home";
		
	}
}
