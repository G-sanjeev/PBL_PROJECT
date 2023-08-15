package com.bookapp.dao;

public class Queries {
	public static final String 	CREATEQUERY	= 
			"create table if not exists book ( bookTitle varchar(20), bookId integer primary key auto_increment, "
			+ "bookAuthor varchar(20), bookCategory varchar(20), price double)	";
	public static final String 	INSERTQUERY	= 
			"insert into book (bookTitle,bookId,bookAuthor,bookCategory,price) values(?,?,?,?,?)";
	public static final String UPDATEQUERY = "update book set price =? where bookId=?";
	public static final String DELETEQUERY = "delete from book where bookId=? ";
	public static final String GETQUERY = "select * from book";
	public static final String AUTHORQUERY = "select * from book where bookAuthor like ?";
	public static final String CATEGORYQUERY="select * from book where bookCategory like ?";
	public static final String PRICELESSQUERY="select * from book where price<?";
	public static final String AUTHORCATEGORYQUERY= "select * from book where author like ? and category like ?";
	public static final String BOOKIDQUERY="select * from book where bookId = ?";
	
	

}
