package com.lumen.coustom;

import java.util.Iterator;

public class Book implements  Comparable<Book> {

	String title;
	String author;
	double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
