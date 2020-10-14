package com.alexandresp15.springBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandresp15.springBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Maria", "maria@gmail.com", "122234442", "12345");
		
		return ResponseEntity.ok().body(user); 
	}

}
