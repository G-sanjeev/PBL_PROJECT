package com.lumen.objbasics;

public class Book {
	String  title;
	String author;
	double price;
	
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void printDetails() {
		System.out.println("Book Title: "+ title);
		System.out.println("Book author: "+ author);
		System.out.println("Book price: "+ price);
	}
	
	double bookPrice(double amount) {
		return price-amount;
	}
	void checkBookType() {
		if(price> 500) {
			System.out.println("the book is premium");
			
		}
		else {
			System.out.println("the standard book");
		}
			}
}
