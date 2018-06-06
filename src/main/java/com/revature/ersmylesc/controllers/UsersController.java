package com.revature.ersmylesc.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.revature.ersmylesc.entities.Users;
import com.revature.ersmylesc.services.UsersServiceImpl;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {
	
	@Autowired
	UsersServiceImpl usersService;
	
	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Users>> getUsers() {
		return new ResponseEntity<>(usersService.allUsers(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> loginUser(@RequestBody Users users) {
		return new ResponseEntity<>(usersService.loginUser(users), HttpStatus.OK);
	}
	
	@PostMapping(value = "/new", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> createUser(@RequestBody Users users) {
		return new ResponseEntity<>(usersService.createUser(users), HttpStatus.OK);
	}
	
}
