package com.example.FSD_11_09_2019_Flight_Reservation.populate;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Ingredient;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Note;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Receipe;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.IngredientRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.NoteRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.ReceipeRepository;
@Component
public class Populate implements ApplicationListener<ContextRefreshedEvent> {
   private ReceipeRepository receipeRepository;
   private IngredientRepository ingredientRepository;
   private NoteRepository noteRepository;
	
  
	public Populate(ReceipeRepository receipeRepository, IngredientRepository ingredientRepository,
		NoteRepository noteRepository) {
	super();
	this.receipeRepository = receipeRepository;
	this.ingredientRepository = ingredientRepository;
	this.noteRepository = noteRepository;
}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	
	private void init()
	{
		Receipe receipe = new Receipe(12,"French Fries",3, "ab.yy.com", "hard");
		Ingredient ingredient = new Ingredient(2, "Tomato");
		Ingredient ingredient2 = new Ingredient(3, "Garam Masala");
		Note note = new Note("First add ingredient 1 and then add ingredient 2");
		ingredient.setReceipe(receipe);
		ingredient2.setReceipe(receipe);
		note.setReceipe(receipe);
		receipe.getIngredients().add(ingredient);
		receipe.getIngredients().add(ingredient2);
		
		
		receipeRepository.save(receipe);
		ingredientRepository.save(ingredient);
		ingredientRepository.save(ingredient2);
		
		noteRepository.save(note);
		
		
		
		
		
		
	}

}
