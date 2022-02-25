package com.example.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
//import org.springframework.data.annotation.Id;

@Entity
public class Customer {

	@Id
	public String id;
	public String firstName;
	public String lastName;
	public int year;

	public Customer() {
	}

	public Customer(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public Customer(String id, String firstName, String lastName, int year) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}