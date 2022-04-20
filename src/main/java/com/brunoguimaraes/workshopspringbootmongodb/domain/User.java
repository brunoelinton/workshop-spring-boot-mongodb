package com.brunoguimaraes.workshopspringbootmongodb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable {

	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;
	
	// BASIC ATRIBUTES
	@Id
	private String id;
	private String name;	
	private String email;
	
	// REFERENCING ANOTHER COLLECTION BY ASSOCIATION
	@DBRef(lazy = true)
	private List<Post> posts = new ArrayList<>();
	
	// DEFAULT CONSTRUCTOR
	public User() {
	}

	// CONSTRUCTOR WITH ARGUMENTS
	public User(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	
	public List<Post> getPosts() {
		return posts;
	}

	// HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}
