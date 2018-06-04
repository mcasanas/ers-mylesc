package com.revature.ersmylesc.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.revature.ersmylesc.entities.Users;
import com.revature.ersmylesc.services.UsersServiceImpl;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersServiceImpl userService;
	
	@GetMapping
	public List<Users> getUsers() {
		return new ArrayList<Users>();
	}
}
