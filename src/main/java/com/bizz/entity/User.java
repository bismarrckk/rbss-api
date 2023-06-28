package com.bizz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String userType;
	private String role;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	private Departments department;
	private String password;

	@JsonBackReference(value="entity-admin")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	private Entities entity;  
	public User() {
		
	}
	
	
	
	public User(int userId, String firstName, String lastName, String userName, String email,
			String userType, String role, Departments department, String password, Entities entity) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.userType = userType;
		this.role = role;
		this.department = department;
		this.password = password;
		this.entity = entity;
	}




	public int getuserId() {
		return userId;
	}


	public void setuserId(int userId) {
		this.userId = userId;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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


	public Entities getEntity() {
		return entity;
	}


	public void setEntity(Entities entity) {
		this.entity = entity;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public Departments getDepartment() {
		return department;
	}



	public void setDepartment(Departments department) {
		this.department = department;
	}

	
	
	
}
