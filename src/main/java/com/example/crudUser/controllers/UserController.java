package com.example.crudUser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudUser.entities.User;
import com.example.crudUser.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping(value = "/insert/{name}/{email}/{age}/{password}")
	public  ResponseEntity<User> insert(@PathVariable String name, @PathVariable String email, @PathVariable int age, @PathVariable String password) {
		User user = new User(null, name, email, age, password);
		service.addUser(user);
		return ResponseEntity.ok().body(user);
	}
	
}
