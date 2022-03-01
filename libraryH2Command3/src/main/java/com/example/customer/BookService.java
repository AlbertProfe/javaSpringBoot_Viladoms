package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepository;
	
	public Iterable<Book> findAll() {
		
		//System.out.println ("Books" + books);
		
		return bookrepository.findAll();
	}
	
	public void save(Book book) {
		
		bookrepository.save(book);
		
		
	}
	
	
}
