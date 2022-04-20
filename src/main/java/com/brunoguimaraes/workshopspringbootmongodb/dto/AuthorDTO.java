package com.brunoguimaraes.workshopspringbootmongodb.dto;

import java.io.Serializable;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;

public class AuthorDTO implements Serializable {

	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;
	
	// BASIC ATRIBUTES FOR POST DTO
	private String id;
	private String name;
	
	// DEFAULT CONSTRUCTOR
	public AuthorDTO() {
	}
	
	// CONSTRUCTOR
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
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
}
