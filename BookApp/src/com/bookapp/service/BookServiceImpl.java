package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {
	List<Book> books;
	
	public BookServiceImpl() {
		super();
		this.books = new BookDetails().showBooks();
	}

	@Override
	public List<Book> getAll() {

		// TODO Auto-generated method stub
		return this.books;
//		BookDetails book = new BookDetails();
//		return (List<Book>) book.showBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> bookByAuthor = new ArrayList<>();
		for (Book book: this.books)
			if (book.getAuthor().contains(author))
				bookByAuthor.add(book);
		if (bookByAuthor.size() == 0)
			throw new BookNotFoundException("no book found by:"+author);
		return bookByAuthor;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> bookByAuthor = new ArrayList<>();
		for (Book book: this.books)
			if (book.getCategory().equals(category))
				bookByAuthor.add(book);
		if (bookByAuthor.size() == 0)
			throw new BookNotFoundException("No book found in : "+category);
		return bookByAuthor;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> bookByAuthor = new ArrayList<>();
		for (Book book: this.books)
			if ((Double) book.getPrice()<price)
				bookByAuthor.add(book);
		if (bookByAuthor.size() == 0)
			throw new BookNotFoundException("No book found in : "+price+"rupees");
		return bookByAuthor;
		
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> bookByAuthor = new ArrayList<>();
		for (Book book : this.books)
			if (book.getAuthor().equals(author)&& book.getCategory().equals(category))
				bookByAuthor.add(book);
		if (bookByAuthor.size() == 0)
			throw new BookNotFoundException("No book written by  : "+author+"and having catogory:"+category);
		return bookByAuthor;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		for(Book book:this.books)
			if(((Integer)book.getBookId())==bookId)
				return book;
		throw new BookNotFoundException("the book doesn't exist");
	}

}
