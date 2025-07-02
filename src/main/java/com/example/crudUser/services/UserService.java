package com.example.crudUser.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudUser.entities.User;
import com.example.crudUser.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
}
