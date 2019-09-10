package restApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restApi.ToDo;

@RestController()
@RequestMapping("/api")
public class ToDoController {
  
	@GetMapping("/toDo")
	public List<ToDo> listToDo()
	{
		List<ToDo> list = new ArrayList<ToDo>();
		list.add(new ToDo("uTHO"));
		list.add(new ToDo("Nahao"));
		return list;
	}
}
