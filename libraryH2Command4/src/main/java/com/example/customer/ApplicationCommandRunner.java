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

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner");

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
		Book book3 = new Book ("B003", "I LOVE JAVA", "Anna", 2, 2023, "GWR-456" );
		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);
		
		userService.save(new User("U005", "Paul", "Mendez", 2006));
		

		
		
		
	}

}
