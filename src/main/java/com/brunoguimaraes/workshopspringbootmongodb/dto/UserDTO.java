package com.brunoguimaraes.workshopspringbootmongodb.dto;

import java.io.Serializable;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;

public class UserDTO implements Serializable {

	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;
	
	// BASIC ATRIBUTES FOR USER DTO
	private String id;
	private String name;	
	private String email;
	
	// DEFAULT CONSTRUCTOR
	public UserDTO() {
	}
	
	// CONSTRUCTOR
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	// GETTERS AND SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
