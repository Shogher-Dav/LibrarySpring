package com.example.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entities.Book;
import com.example.library.services.LibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	
	
	@GetMapping("/book")
	  public Iterable<Book> getBooks(){
	    return libraryService.getBooks();
	  }
	
	@PostMapping("/addbook")
	  public Book getBooks(@RequestBody Book book){
	    return libraryService.addBook(book);
	  }
	
	@DeleteMapping("/deletebook/{id}")
	  public void getBooks( @PathVariable Integer id){
	    libraryService.deleteBook(id);
	  }


}
