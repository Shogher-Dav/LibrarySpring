package com.example.library.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer id;
	
	private  String title;
	
	private Integer pages;
	
	private Integer year;
	
//	@Column(name="author_id")
//	private Integer authorId;
	
	 @ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	 @JoinTable(name="book_author")
	 private List<Author> author;
	
			
	
	Book(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

//	public Integer getAuthorId() {
//		return authorId;
//	}
//
//	public void setAuthorId(Integer authorId) {
//		this.authorId = authorId;
//	}

//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", title=" + title + ", pages=" + pages + ", year=" + year + ", authorId=" + authorId
//				+ "]";
//	}
//	
	
	
	

}
