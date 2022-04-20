package com.brunoguimaraes.workshopspringbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoguimaraes.workshopspringbootmongodb.domain.Post;
import com.brunoguimaraes.workshopspringbootmongodb.repository.PostRepository;
import com.brunoguimaraes.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
		
	// RETURN USER BY ID
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);		
		return post.orElseThrow(()-> new ObjectNotFoundException("Object not found."));
	}

	// RETURN A POST WITH TEXT
	/*
	public List<Post> findByTitle(String text){
		return repository.findByTitleContainingIgnoreCase(text);
	}
	*/
	
	// RETURN A POST WITH TEXT
	public List<Post> findByTitle(String text){
		return repository.searchTitle(text);
	}
}
