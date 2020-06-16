package com.example.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auth.model.User;
import com.example.auth.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> getAllUsers() {
	  
		 return repository.findAll();
	}

	@Override
	public User save(User newUser) {
		 
        return repository.save(newUser);
	}

	
}
