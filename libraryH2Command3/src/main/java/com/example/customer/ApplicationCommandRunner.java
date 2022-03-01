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

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner");

		
		User user1 = new User("1","Tom", "Jones");
		User user2 = new User("2", "Silvia", "Eriksson");
		User user3 = new User("3", "Anna", "Britzles");
		User user4 = new User("4", "Paul", "Gates");
		

		userService.save(user1);
		userService.save(user2);
		userService.save(user3);
		userService.save(user4);
		
		logger.info("count: " + userService.count());
		logger.info(userService.findAll());
		logger.info("exists ['1']: " + userService.existsById("1"));
		
		
		userService.findAndDeleteById("1");
		
		logger.info("count: " + userService.count());
		logger.info(userService.findAll());
		logger.info("exists ['1']: " + userService.existsById("1"));
		
		userService.save(new User("5", "Paul", "Mendez"));
		

		logger.info("count: " + userService.count());
		logger.info(userService.findAll());
		logger.info("exists ['1']: " + userService.existsById("1"));
		logger.info("exists ['5']: " + userService.existsById("5"));
		
		user2.setFirstName("Olga");
		logger.info("count: " + userService.count());
		userService.update("2", user2);
		logger.info(userService.findAll());

	}

}
