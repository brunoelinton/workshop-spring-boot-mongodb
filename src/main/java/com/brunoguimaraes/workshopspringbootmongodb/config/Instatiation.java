package com.brunoguimaraes.workshopspringbootmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.brunoguimaraes.workshopspringbootmongodb.domain.User;
import com.brunoguimaraes.workshopspringbootmongodb.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRespoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// DELETING ALL USERS
		userRespoRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userRespoRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
