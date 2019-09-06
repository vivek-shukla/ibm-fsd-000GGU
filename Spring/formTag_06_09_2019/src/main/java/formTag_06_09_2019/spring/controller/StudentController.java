package formTag_06_09_2019.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import formTag_06_09_2019.spring.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
    
	@GetMapping("/showForm")
	public String redirectToStudentForm(Model model)
	{  Student student = new Student();
	   model.addAttribute("st", student);
	   
		return "studentForm";
	}
	
	@PostMapping("/processForm")
	public String  redirectToDetail(@ModelAttribute("st") Student st,Model model)
	{
		model.addAttribute("tempStudent", st);
		return "detail";
	}
}
