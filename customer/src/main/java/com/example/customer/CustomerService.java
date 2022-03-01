package com.example.customer;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	// crud basic operations
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Customer save(Customer customer) {
		customerRepository.save(customer);

		return customer;
	}

	public String findAndDeleteById(String id) {

		String response = "";
		Optional<Customer> customerFound = customerRepository.findById(id);

		if (customerFound.isPresent()) {

			customerRepository.delete(customerFound.get());
			response += "customer deleted";
		} else {

			response += "customer not found";
		}

		return response;
	}

	public void deleteById(String id) {

		// String response = "";

		customerRepository.deleteById(id);

	}

	public String update(String id, Customer customer) {

		String response = "";
		Optional<Customer> customerFound = customerRepository.findById(id);

		if (customerFound.isPresent()) {

			customerFound.get().setFirstName(customer.getFirstName());
			customerRepository.save(customerFound.get());
			response += "customer updated";

		} else {
			response += "customer not found";
		}

		return response;

	}

	// other options
	public long count() {

		long quantity = customerRepository.count();

		return quantity;
	}

	public boolean existsById(String id) {

		boolean isCustomer = customerRepository.existsById(id);

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
