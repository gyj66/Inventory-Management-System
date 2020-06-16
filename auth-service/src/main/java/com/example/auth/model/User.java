package com.example.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	 @Id
	 @GeneratedValue
	private Long id;
	private String username;
	private String password;
	
	public User()
	{}
	
	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	
	
	
	
	
	
}
