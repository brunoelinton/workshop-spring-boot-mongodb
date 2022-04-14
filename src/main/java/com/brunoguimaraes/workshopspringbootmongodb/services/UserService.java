package com.brunoguimaraes.workshopspringbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;
import com.brunoguimaraes.workshopspringbootmongodb.dto.UserDTO;
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
	
	// INSERT USER AND RETURN TO THEN
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	// DELETE USER
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	// INSTATIATE USER FROM USER_DTO
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
	
	
}
