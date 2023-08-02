 package com.lumen.coustom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BookMain {

	public static void main(String[] args) {
//		Book book1 = new Book("Doremon","sk",500.00);
//		Book book2 = new Book("Spider man","sanjeev",1000.0);
//
//		Book book3 = new Book("marvel","Kite",800.0);
//		Book book4 = new Book("java","Kite",800.0);
//		
//		
//		
//		List<Book> books = new ArrayList<Book>();
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		books.add(book4);
//		
//		Iterator<Book> iterator = books.iterator();
//		for(Book bookdata:books)
//			System.out.println(bookdata.getAuthor());
//		while(iterator.hasNext()) {
//			Book bookdata = iterator.next();
//			System.out.println(bookdata);
//		}
//		List<Book> booksByAuthor = new ArrayList<>();
//		System.out.println("book author");
//		String author = "Kite";
//		for(Book book:books) {
////			System.out.println(book);
//			if(book.getAuthor().equals(author)) {
//				booksByAuthor.add(book);
//			}
//		}
//		for(Book book:booksByAuthor)
//			System.out.println(book.getTitle());
		
		
		List<Book> books =  Arrays.asList(new Book("java","kathy",900),
				new Book("5amclub","robin",350),
						new Book("leadership","Robin",900),
						new Book("spring","john",1900),
						new Book("jsp","kathy",900)
						);
		
		
	}

}
