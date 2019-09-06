package spring_webapp_05_09_2019.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring_webapp_05_09_2019.spring.Student;

@Controller
public class FirstControl {
	@RequestMapping(method = RequestMethod.GET,name = "/firstController")
	public String redirectToForm()
	{  
		
		return "student_form";
	}
	
	@RequestMapping(method = RequestMethod.POST,name="/secondController")
	public String redirectToResult(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("email") String email,Model model)
	{  Student studentObj= new Student(id,name,email);
	   model.addAttribute("a", studentObj );
		return "result";
	}

}
