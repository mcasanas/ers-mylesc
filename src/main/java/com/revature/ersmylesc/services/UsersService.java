package com.revature.ersmylesc.services;

import java.util.List;

import com.revature.ersmylesc.entities.Users;


public interface UsersService {
	public Users loginUser(Users user);
	public Users createUser(Users user);
	public List<Users> allUsers();
}
