package com.example.FSD_11_09_2019.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.FSD_11_09_2019.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
