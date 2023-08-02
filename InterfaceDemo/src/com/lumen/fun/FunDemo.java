package com.lumen.fun;

import java.util.function.Consumer;

public class FunDemo {

	public static void main(String[] args) {
// Implementing consumer using lambda
		Consumer<String> consumer = (str)->System.out.println(str.toUpperCase());
		//call the method
		consumer.accept("Sri");
		// do it for integer
//		
//		Consumer<Integer> consumerInt = (obj)-> System.out.println();
//		consumerInt.accept(10);
		
		Consumer<Book> getBook = (book)-> System.out.println(book);
		getBook.accept(new Book("Ninja tackles ","sk","Namrat",10));
		
	}

}
