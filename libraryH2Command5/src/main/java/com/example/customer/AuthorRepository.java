package com.example.customer;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,String> {

	void save(User author);

	void deleteByName(String lastname);

	long countByName(String lastname);

}