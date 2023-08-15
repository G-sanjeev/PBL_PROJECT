package com.bookapp.service;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements IBookService {
	IBookDao bookDao = new BookDaoImpl();

	@Override
	public List<Book> getAll() {
		return bookDao.findAll();
	}

	@Override
	public void addBook(Book book) {
		try {
			bookDao.addBook(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		try {
			bookDao.updateBook(bookId,price);
		} catch (Exception e) {
		e.getStackTrace();}
				
	}

	@Override
	public void deleteBook(int bookId) {
		try {
			bookDao.deleteBook(bookId);
		} catch (Exception e) {
		e.getStackTrace();}
				
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books= bookDao.findByAuthorContains(author);
		if(books.isEmpty()) {
			throw new BookNotFoundException("books not found by author"	);
		}
		return books.stream().sorted((o1,o2)->o1.compareTo(o2)).toList();
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books= bookDao.findByCategory(category);
		if(books.isEmpty()) {
			throw new BookNotFoundException("books not found by author"	);
		}
		return books.stream().sorted((o1,o2)->o1.compareTo(o2)).toList();
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books= bookDao.findByPriceLessThan(price);
		if(books.isEmpty()) {
			throw new BookNotFoundException("books not found by author"	);
		}
		return books.stream().sorted((o1,o2)->o1.compareTo(o2)).toList();
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books= bookDao.findByAuthorContainsAndCategory(author,category);
		if(books.isEmpty()) {
			throw new BookNotFoundException("books not found by author"	);
		}
		return books.stream().sorted((o1,o2)->o1.compareTo(o2)).toList();
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Book book = bookDao.findById(bookId);
		if(book == null)
			throw new BookNotFoundException("book not found by id");
		return book;
	}

	

}
