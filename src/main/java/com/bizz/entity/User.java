package com.bizz.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private String role;
	@JsonBackReference(value="company-user")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="company_id")
	private CompanyDetails company;  
	public User() {
		
	}
	
	
	public User(int id, String firstName, String lastName, String userName, String email, String password, String role,
			CompanyDetails company) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.company = company;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	public String getFirsName() {
		return firstName;
	}


	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public CompanyDetails getCompany() {
		return company;
	}


	public void setCompany(CompanyDetails company) {
		this.company = company;
	}
	
	
}
