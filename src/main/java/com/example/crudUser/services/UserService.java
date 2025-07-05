package com.example.crudUser.services;

import java.util.List;
import java.util.Optional;

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
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
	
	public User updateNameById(String name, Long id) {
		User user = userRepository.findById(id).get();
		user.setName(name);
		return userRepository.save(user);
	}
	
}
