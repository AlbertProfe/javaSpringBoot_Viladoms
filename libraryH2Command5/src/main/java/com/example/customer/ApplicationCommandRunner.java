package com.example.customer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCommandRunner implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner to test JPA mapping 1:n");

		User user1 = new User("U001","Tom", "Jones", 1985);
		User user2 = new User("U002", "Silvia", "Eriksson", 1923);
		User user3 = new User("U003", "Anna", "Gates", 1956);
		User user4 = new User("U004", "Paul", "Gates", 2001);
		userService.save(user1);
		userService.save(user2);
		userService.save(user3);
		userService.save(user4);
		
		Book book1 = new Book ("B001" ,"Anna Karenina", "Tolstoi", 562, 1896, "BR5GV-5-ERG5-6567");
		Book book2 = new Book ("B002", "To the lighthouse", "V Wolf", 235, 1626, "56756-DFGRT-554" );
		Book book3 = new Book ("B003", "I LOVE JAVA", "Anna",502, 2023, "BE6YH6-GWR-456" );
		Book book4 = new Book ("B004", "Orlando", "V Wolf", 232, 2023, "STHS-sdfgWR-456" );
		Book book5 = new Book ("B005", "On romm of my own", "V Wolf", 220, 2023, "890OL42-GWR-456" );
		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);
		bookService.save(book4);
		bookService.save(book5);
		
		userService.save(new User("U005", "Paul", "Mendez", 2006));
		
		//we add to arraylist books of user 
		user1.addBook(book1);
		user1.addBook(book2);
		user1.addBook(book3);
		user2.addBook(book3);
		
		//save to bd by JPA query crudrepository-service
		userService.save(user1);
		userService.save(user2);
		
		logger.info("toString user1 " + user1);
		logger.info("toString user2 " + user2);
		
		logger.info("user1 get books " + user1.getBooks());
		logger.info("user2 get books " + user2.getBooks());
		
		Author author1 = new Author("A001","Leo Tolstoi", "Russia");
		Author author2 = new Author("A002","Virginia Wolf", "English");
		Author author3 = new Author("A003","Dante Alighieri", "Italian");
		
		authorService.save(author1);
		authorService.save(author2);
		authorService.save(author3);
		
		author2.addBook(book2);
		author2.addBook(book4);
		author2.addBook(book5);
		
		authorService.save(author2);
		logger.info("author2 get books " + author2.getBooks());
		
		author1.addBook(book1);
		authorService.save(author1);
		logger.info("author1 get books " + author1.getBooks());
		
		
	}

}
