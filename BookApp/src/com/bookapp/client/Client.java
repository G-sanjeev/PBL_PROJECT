package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client  {

	public static void main(String[] args) throws BookNotFoundException{
		IBookService bookService = new BookServiceImpl();	
		bookService.getByAuthorContains("Robin Sharma");
		bookService.getByAuthorContainsAndCategory("john David","Tech");
		bookService.getByCategory("Tech");
		bookService.getByPriceLessThan(1000.00);
		bookService.getById(2);
		System.out.println(bookService.getAll());
		
	}

}
