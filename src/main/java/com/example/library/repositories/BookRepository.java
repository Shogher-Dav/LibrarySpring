package com.example.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entities.Book;

public interface BookRepository  extends CrudRepository<Book, Integer>{

}
