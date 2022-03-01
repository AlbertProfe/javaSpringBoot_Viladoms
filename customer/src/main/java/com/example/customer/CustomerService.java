package com.example.customer;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	public Iterable<Customer> findAll() {
		return customerrepository.findAll();
	}

	public Customer save(Customer customer) {
		customerrepository.save(customer);

		return customer;
	}

	public String findAnddeleteById(String id) {

		String response = "";
		Optional<Customer> customerFound = customerrepository.findById(id);

		if (customerFound.isPresent()) {

			customerrepository.delete(customerFound.get());
			response += "customer deleted";
		} else {

			response += "customer not found";
		}

		return response;
	}

	public void deleteById(String id) {

		// String response = "";

		customerrepository.deleteById(id);

	}
	
	public String update (String id, Customer customer) {
		
		String response = "";
		
		Optional<Customer> customerFound = customerrepository.findById(id);
		
		if (customerFound.isPresent()) {
			
			//customerFound.get()
			
			customerrepository.save(customerFound.get());
			
			response += "customer updated";
		} else {

			response += "customer not found";
		}
		
		
		
		return response;
		
	}
	
}
