package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.library.model.Borrow;


public interface BorrowRepository extends CrudRepository <Borrow, Integer>{

	void deleteById(String id);

}
