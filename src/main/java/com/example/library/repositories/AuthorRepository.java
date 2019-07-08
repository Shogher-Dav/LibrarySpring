package com.example.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entities.Author;

public interface AuthorRepository  extends CrudRepository<Author, Integer>{

}
