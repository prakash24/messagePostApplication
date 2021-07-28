package com.prakash.messaging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.messaging.model.User;
import com.prakash.messaging.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void addUser(String name, String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
    	userRepository.save(user);
	}
	
	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}
}
