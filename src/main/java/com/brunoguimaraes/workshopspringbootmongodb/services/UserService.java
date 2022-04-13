package com.brunoguimaraes.workshopspringbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;
import com.brunoguimaraes.workshopspringbootmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// RETURN ALL USERS
	public List<User> findAll() {
		return repository.findAll();
	}
}
