package com.bookapp.client;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class Client {

	public static void main(String[] args) {
		System.out.println("get all details of the book");
		List<Book> book = BookDetails.showBooks();
		book.stream().forEach(System.out::println);

		System.out.println("enter the author");
		Scanner scanner = new Scanner(System.in);
		String author = scanner.nextLine();
		
		List<Book> bookByAuthor = book.stream().filter(str-> str.getAuthor().equals(author))
				.collect(Collectors.toList());
		if(bookByAuthor.isEmpty()) {
			throw new BookNotFoundException("book not found");
			
		}
		bookByAuthor.forEach(System.out::println);
//		String category = scanner.next();
//		Optional<Book> booksByAuthor = Optional.of(book.stream().filter(str -> str.getAuthor().equals(author))
//				.findFirst().orElseThrow(() -> new BookNotFoundException("book not found")));
//		System.out.println(booksByAuthor);
//		
		System.out.println("enter the category");
		
//		String author = scanner.nextLine();
		String category = scanner.next();
		List<Book> booksByCategory = book.stream().filter(str -> str.getCategory().equals(category))
				.collect(Collectors.toList());
		if(booksByCategory.isEmpty()) {
			throw new BookNotFoundException("book not found");
			
		}
		booksByCategory.forEach(System.out::println);
		
		System.out.println("enter the price");
		double price = scanner.nextDouble();
		List<Book> booksByPrice = book.stream().filter(str->str.getPrice()< price)
				.collect(Collectors.toList());
		if(booksByPrice.isEmpty()) {
			throw new BookNotFoundException("Book not found not availabel by that price");
		}
		booksByPrice.forEach(System.out::println);
		
		System.out.println("Books by author and categore");
		System.out.println("enter the author");
		String author1 = scanner.nextLine();
		System.out.println(" ");
		System.out.println("enter the category");
		String category1 = scanner.nextLine();
		List<Book> booksByAuthorCategore= book.stream().filter(str->str.getAuthor().equals(author1) && str.getCategory().equals(category1))
				.collect(Collectors.toList());
		if(booksByPrice.isEmpty()) {
			throw new BookNotFoundException("Book not found not availabel by that author or categore");
		}
		booksByAuthorCategore.forEach(System.out::println);
		
		System.out.println("enter the ID");
		int getId= scanner.nextInt();
		List<Book> booksById= book.stream().filter(str->str.getBookId().equals(getId))
				.collect(Collectors.toList());
		if(booksById.isEmpty()) {
			throw new BookNotFoundException("Book not found By that Id");
		}
		booksById.forEach(System.out::println);
	}

}
