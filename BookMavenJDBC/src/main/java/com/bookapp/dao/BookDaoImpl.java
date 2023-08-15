package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookDaoImpl implements IBookDao {

	@Override
	public void addBook(Book book){
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
			// assign value for each column
			statement.setString(1, book.getTitle());
			statement.setInt(2, book.getBookId());
			statement.setString(3, book.getAuthor());
			statement.setString(4, book.getCategory());
			statement.setDouble(5, book.getPrice());
			statement.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateBook(int bookId, double price) {

		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			// assign value for each column
			statement.setInt(2, bookId );
			statement.setDouble(1,price);
			statement.execute();
		} catch (Exception e) {
			e.getStackTrace();
		}


	}

	@Override
	public void deleteBook(int bookId) {
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);) {
			// assign value for each column
			statement.setInt(1,bookId);
			statement.execute();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	@Override
	public List<Book> findAll() throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.GETQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author = resultSet.getString("bookAuthor");
				String category = resultSet.getString("bookCategory");
				int bookId = resultSet.getInt("bookId");
				double price = resultSet.getDouble("price");
				bookList.add( new Book(name,bookId,author,category,price));
							
			}
			
		} catch(Exception e	) {
			e.getStackTrace();
		}
		return bookList;
		

	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.AUTHORQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			statement.setString(1, "%"+author+"%");
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author1 = resultSet.getString("bookAuthor");
				String category = resultSet.getString("bookCategory");
				int bookId = resultSet.getInt("bookId");
				double price = resultSet.getDouble("price");
				bookList.add( new Book(name,bookId,author1,category,price));
				
//				System.out.println(name+"\t"+bookId+"\t"+author+"\t"+category+"\t"+price);
				
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return bookList;
		
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.CATEGORYQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			statement.setString(1, "%"+category+"%");
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author1 = resultSet.getString("bookAuthor");
				String category1= resultSet.getString("bookCategory");
				int bookId = resultSet.getInt("bookId");
				double price = resultSet.getDouble("price");
				bookList.add( new Book(name,bookId,author1,category1,price));
				
//				System.out.println(name+"\t"+bookId+"\t"+author+"\t"+category+"\t"+price);
				
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return bookList;
	
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.PRICELESSQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			statement.setDouble(1, price);
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author1 = resultSet.getString("bookAuthor");
				String category = resultSet.getString("bookCategory");
				int bookId = resultSet.getInt("bookId");
				double price1 = resultSet.getDouble("price");
				bookList.add( new Book(name,bookId,author1,category,price1));
				
//				System.out.println(name+"\t"+bookId+"\t"+author+"\t"+category+"\t"+price);
				
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return bookList;
	}

//	@Override
//	public List<Book> findByDatePublished(int year) throws BookNotFoundException {
//		return null;
//	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.AUTHORCATEGORYQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			statement.setString(1, author);
			statement.setString(2,category);
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author1 = resultSet.getString("bookAuthor");
				String category1 = resultSet.getString("bookCategory");
				int bookId = resultSet.getInt("bookId");
				double price = resultSet.getDouble("price");
				bookList.add( new Book(name,bookId,author1,category1,price));
				
//				System.out.println(name+"\t"+bookId+"\t"+author+"\t"+category+"\t"+price);
				
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return bookList;	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
//		Book bookList = new ArrayList<Book>();
		Book book1 = new Book();
		try (Connection connection = DBConnection.openConnection(); // get connection
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.BOOKIDQUERY);
						ResultSet resultSet = statement.executeQuery();) {
			statement.setInt(1, bookId);
			// assign value for each column
			while(resultSet.next()) {
				
				String name = resultSet.getString("bookTitle");
				String author1 = resultSet.getString("bookAuthor");
				String category = resultSet.getString("bookCategory");
				int bookId1 = resultSet.getInt("bookId");
				double price = resultSet.getDouble("price");
				book1= new Book(name,bookId,author1,category,price);
				
				
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return book1;
	}

}