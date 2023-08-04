package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;


public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(new Book("java in Action","john David","Tech",1,900.90),
				new Book("5 am club","Robin Sharma","Selfhelp",2,300.68),
				new Book("Html for Dummmies","Ben john","Tech",3,900.90),
				new Book("java in Action","john David","Tech",1,900.90),
				new Book("java in Action","john David","Tech",1,900.90));
	}

}
