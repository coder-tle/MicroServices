package com.example.UserMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserMicroService.entity.User;
import com.example.UserMicroService.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired 
	UserService service;
	
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	@GetMapping("/{id}")
	public User addUser(@PathVariable int id) {
		return service.getUserById(id);

	}
	
	@GetMapping("/")
	public List<User> getAllUsers() {
		return service.getAll();
	}
}
