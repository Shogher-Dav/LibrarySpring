package com.example.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entities.Book;
import com.example.library.repositories.BookRepository;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Iterable<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
		
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
