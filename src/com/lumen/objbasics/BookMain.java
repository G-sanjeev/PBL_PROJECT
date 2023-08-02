package com.lumen.objbasics;



public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book( "Song of fire in ice","George ", 500.00);
		book1.printDetails();
		book1.bookPrice(500.00);
		book1.checkBookType();
		
		Book book2 = new Book("The legend of Kora","Steven Smith",2000.00);
		book2.printDetails();
		book2.bookPrice(200.00);
		book2.checkBookType();
		
		
		
	}

}
