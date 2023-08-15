package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
//import com.bookapp.util.BookDetails;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		String title;
		int bookId;
		String author;
		String category;
		double price;
		IBookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("enter the choice:" + "1.addBook" + "2.updateBook" + "3.deleteBook" + "4.findall"
						+ "5.findByAuthorcontains" + "6.findByCategory" + "7.findbypriceless"
						+ "8.find by author and category" + "9.find by bookId" + "10.exit");

				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:

					System.out.println("enter the Title of the book");
					title = scanner.nextLine();
					System.out.println("enter the book id");
					System.out.println();
					bookId = scanner.nextInt();
					System.out.println("enter the author name");
					author = scanner.nextLine();
					scanner.nextLine();
					System.out.println("enter the category of book ");
					category = scanner.nextLine();
					System.out.println("enter the price");
					price = scanner.nextDouble();
					bookService.addBook(new Book(title, bookId, author, category, price));
					System.out.println();
					break;
				case 2:
					System.out.println("enter bookId");
					bookId = scanner.nextInt();
					System.out.print("Enter the new price: ");
					price = scanner.nextDouble();
					bookService.updateBook(bookId, price);
					System.out.println();
					break;
				case 3:
					System.out.print("Enter BookID: ");
					bookId = scanner.nextInt();
					bookService.deleteBook(bookId);
					System.out.println();
					break;
				case 4:
					List<Book> books = bookService.getAll();
					System.out.println("\nBooks available in Library");
					books.forEach(System.out::println);
					System.out.println();
					break;
				case 5:
					System.out.println("Enter author name: ");
					author = scanner.nextLine();
					try {
						bookService.getByAuthorContains(author).forEach(System.out::println);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 6:
					System.out.println("Enter category: ");
					category = scanner.nextLine();
					try {
						bookService.getByCategory(category).forEach(System.out::println);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 7:
					System.out.println("Enter book price: ");
					price = scanner.nextDouble();
					try {
						bookService.getByPriceLessThan(price).forEach(System.out::println);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 8:
					System.out.println("Enter author name: ");
					author = scanner.nextLine();
					System.out.println("Enter category: ");
					category = scanner.nextLine();
					try {
						bookService.getByAuthorContainsAndCategory(author, category).forEach(System.out::println);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 9:
					System.out.println("Enter bookId: ");
					bookId = scanner.nextInt();
					try {
						System.out.println(bookService.getById(bookId));
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 10:
					System.exit(0);
				default:
					break;

				}

			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			scanner.close();
		}
	}

}
