package com.revature.ersmylesc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ersmylesc.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
	public Users findUsersByUsernameAndPassword(String username, String password);
	public Users findUsersByEmail(String email);
}
