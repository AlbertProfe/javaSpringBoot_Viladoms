package com.example.customer;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	// crud basic operations
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User customer) {
		userRepository.save(customer);

		return customer;
	}

	public String findAndDeleteById(String id) {

		String response = "";
		Optional<User> customerFound = userRepository.findById(id);

		if (customerFound.isPresent()) {

			userRepository.delete(customerFound.get());
			response += "customer deleted";
		} else {

			response += "customer not found";
		}

		return response;
	}

	public void deleteById(String id) {

		// String response = "";

		userRepository.deleteById(id);

	}

	public String update(String id, User customer) {

		String response = "";
		Optional<User> customerFound = userRepository.findById(id);

		if (customerFound.isPresent()) {

			customerFound.get().setFirstName(customer.getFirstName());
			userRepository.save(customerFound.get());
			response += "customer updated";

		} else {
			response += "customer not found";
		}

		return response;

	}

	// other options
	public long count() {

		long quantity = userRepository.count();

		return quantity;
	}

	public boolean existsById(String id) {

		boolean isCustomer = userRepository.existsById(id);

		return isCustomer;
	}

	public void countByLastname(String lastname) {

		// long quantity = customerRepository.countByLastname(lastname);

		// return quantity;
	}

	public void deleteByLastname(String lastname) {

		// customerRepository.deleteByLastname(lastname);

	}

}
