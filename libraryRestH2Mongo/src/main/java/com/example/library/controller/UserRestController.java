package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.User;
import com.example.library.service.UserService;

@RestController
@RequestMapping("api")
public class UserRestController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("users")
	public Iterable<User> getAllUsers() {
		
	
		
		return userservice.findAll();
	}

}
