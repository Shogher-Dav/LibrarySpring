package com.example.library.services;


import com.example.library.entities.Book;

public interface LibraryService {
	
	public Iterable<Book> getBooks();
	public void deleteBook(Integer id);
	public Book addBook(Book book);
	public Book updateBook(Book book, Integer id);
	

}
