package com.lumen.fun;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private String category;
	private Integer bookId;
//	private LocalDate publishdate;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
public Book(String title, String author, String category, Integer bookId) {
	super();
	this.title = title;
	this.author = author;
	this.category = category;
	this.bookId = bookId;
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
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", category=" + category + ", bookId=" + bookId + "]";
}
	
	

}
