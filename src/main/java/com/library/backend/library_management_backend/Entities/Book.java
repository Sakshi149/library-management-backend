package com.library.backend.library_management_backend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Book {

	@Id
	private Long id;
	private String title;
	private String author;
	private String genre;
	private String body;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", body=" + body
				+ "]";
	}
	
	public Book(long id, String title, String author, String genre, String body) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.body = body;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}