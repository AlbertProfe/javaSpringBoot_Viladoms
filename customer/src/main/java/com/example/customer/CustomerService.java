package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	public Iterable<Customer> findAll() {

		
		return customerrepository.findAll();
	}

	public Customer save (Customer customer) {

		customerrepository.save(customer);

		return customer;
	}

}
