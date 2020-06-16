package com.example.auth.service;

import java.util.List;

import com.example.auth.model.User;

public interface UserService {
     
	   List<User> getAllUsers();
	   
	   User save(User newUser);
}
