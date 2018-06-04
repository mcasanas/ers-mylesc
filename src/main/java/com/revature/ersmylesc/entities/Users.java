package com.revature.ersmylesc.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="USERS")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name= "USERNAME", unique=true)
	@NotNull
	private String username;
	
	@Column(name= "PASSWORD")
	@NotNull
	private String password;
	
	@Column(name= "FIRST_NAME")
	@NotNull
	private String firstName;
	
	@Column(name= "LAST_NAME")
	@NotNull
	private String lastName;
	
	@Column(name= "EMAIL", unique= true)
	@NotNull
	private String email;
	
	@Column(name= "ROLE")
	@NotNull
	private String role;
	
	public Users() {
		super();
	}

	public Users(String username, String password, String firstName, String lastName, String email, String role) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
