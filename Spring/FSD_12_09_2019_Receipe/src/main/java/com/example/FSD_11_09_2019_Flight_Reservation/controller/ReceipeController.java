package com.example.FSD_11_09_2019_Flight_Reservation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Ingredient;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Note;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Receipe;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.IngredientRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.NoteRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.ReceipeRepository;

@Controller
@RequestMapping("/receipe")
public class ReceipeController {
	
	 private ReceipeRepository receipeRepository;
	   private IngredientRepository ingredientRepository;
	   private NoteRepository noteRepository;
	public ReceipeController(ReceipeRepository receipeRepository, IngredientRepository ingredientRepository,
			NoteRepository noteRepository) {
		super();
		this.receipeRepository = receipeRepository;
		this.ingredientRepository = ingredientRepository;
		this.noteRepository = noteRepository;
	}
	@RequestMapping("/list")
	public String redirectToReceipeList(Model theModel)
	{
		theModel.addAttribute("receipeList", receipeRepository.findAll());
		return "receipeList";
	}
	@GetMapping("/view")
	public String showRecipe(@RequestParam("id") int id,Model theModel)
	{
		Optional<Receipe> receipe = receipeRepository.findById(id);
		
		if(receipe.isPresent())
		{  System.out.println(noteRepository.findByReceipe(receipe.get()));
			theModel.addAttribute("note",noteRepository.findByReceipe(receipe.get()));
			theModel.addAttribute("receipe", receipe.get());
			
			
		}
		return "recipeDesription";
		
	}
	
	@GetMapping("/showForm")
	public String showReceipeForm(Model theModel)
	{
		
		Receipe receipeObj = new Receipe();
		theModel.addAttribute("ingredientList", ingredientRepository.findAll());
	    theModel.addAttribute("receipe", receipeObj);
	    theModel.addAttribute("note", new Note());
		return "receipeForm";
	}
	
	@PostMapping("/save")
	public String saveReceipe(@ModelAttribute("receipe") Receipe receipe,Model theModel)
	{
		receipeRepository.save(receipe);
		
		return "redirect:/receipe/list";
	}

}
