package com.example.FSD_11_09_2019_Flight_Reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Ingredient;
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

}
