package com.revature.ersmylesc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.ersmylesc.entities.Users;
import com.revature.ersmylesc.repositories.UsersRepository;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepository usersRepo;
	
	@Override
	public Users loginUser(Users user) {
		Users myUser = usersRepo.findUsersByUsernameAndPassword(user.getUsername(), user.getPassword());
		if(myUser == null) {
			return null;
		} else {
			myUser.setPassword("");
			return myUser;
		}
	}

	@Override
	public Users createUser(Users user) {
		List<Users> users = usersRepo.findAll();
		for(Users temp: users) {
			if(temp.getUsername().equals(user.getUsername()) || temp.getEmail().equals(user.getEmail()) ){
				return null;
			}
		}
		return usersRepo.save(user);
	}

	@Override
	public List<Users> allUsers() {
		return usersRepo.findAll();
	}

}
