package com.api.lang;

public class BookMain {

	public static void main(String[] args) {
		//if title and isbn number same then they are same objects
		Book book1 = new Book("HeadFirst Java","Kathy","18723456L");
		Book book2 = new Book("HeadFirst java ","John","18723456Ly");
		Book book3 = new Book("java ","Katty","18723456L");
		
		System.out.println("1 and 2 "+book1.equals(book2));
		System.out.println("1 and 3 "+book1.equals(book3));
		System.out.println("1hash"+book1.hashCode());
		System.out.println("2hash"+book2.hashCode());
		System.out.println("3hash"+book3.hashCode());
	}
	

}
