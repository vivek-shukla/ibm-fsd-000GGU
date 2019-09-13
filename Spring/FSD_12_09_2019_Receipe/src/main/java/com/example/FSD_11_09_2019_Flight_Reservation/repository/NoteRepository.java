package com.example.FSD_11_09_2019_Flight_Reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Note;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Receipe;
@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
	
	public Note findByReceipe(Receipe receipe);

}
