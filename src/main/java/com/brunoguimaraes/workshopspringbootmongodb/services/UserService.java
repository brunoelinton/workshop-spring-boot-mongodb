package com.brunoguimaraes.workshopspringbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;
import com.brunoguimaraes.workshopspringbootmongodb.repository.UserRepository;
import com.brunoguimaraes.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// RETURN ALL USERS
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// RETURN USER BY ID
	public User findById(String id) {
		Optional<User> user = repository.findById(id);		
		return user.orElseThrow(()-> new ObjectNotFoundException("Object not found."));
	}
}
