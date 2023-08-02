package com.api.lang;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String isbnNumber;
	
	//constructor
	public Book(String title, String author, String isBookNumber) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isBookNumber;
	}
	//hash code comparison
	
	
	public String getTitle() {
		return title;
	}
	@Override
	public int hashCode() {
		return Objects.hash( isbnNumber, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbnNumber, other.isbnNumber)
				&& Objects.equals(title, other.title);
	}

	//getter and setter method
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsBookNumber() {
		return isbnNumber;
	}
	public void setIsBookNumber(String isBookNumber) {
		this.isbnNumber = isBookNumber;
	}
	//tostring method
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbnNumber=" + isbnNumber + "]";
	}
	

}
