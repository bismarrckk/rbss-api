package com.bizz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="internal_users")
public class InternalUsers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String fullname;
	private String email;
	private String username;
	private String role;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id", referencedColumnName = "departmentId")
	private Departments department;
	public InternalUsers(int userId, String fullname, String email, String username, String role,
			Departments department) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.role = role;
		this.department = department;
	}
	public InternalUsers() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
