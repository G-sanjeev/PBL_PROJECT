package com.lumen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookStreamsDemo {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("java", "kathy", 200, 1), 
				new Book("spring", "john", 200, 2),
				new Book("Node", "kathy", 200, 3));

		books.stream()
		.filter(book -> book.getAuthor().equals("kathy"))
		.forEach(book -> System.out.println(book));
		
		List<Integer > titlearr= books.stream()
				.map(book->(int) Math.pow(book.getTitle().length(), 2))
				.collect(Collectors.toList());
		titlearr.forEach(name -> System.out.println("title of the books:"+name));
		
		List<Double> titlearr1 = books.stream()
				.map(book-> book.getTitle().length())
				.map(num -> Math.pow(num, 2))
				.collect(Collectors.toList());
		
		titlearr1.forEach(num->System.out.println(num));
	}

}
