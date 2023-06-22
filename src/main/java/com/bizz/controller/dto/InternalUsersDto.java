package com.bizz.controller.dto;


import com.bizz.entity.Departments;

public class InternalUsersDto {
	private int userId;
	private String fullname;
	private String email;
	private String username;
	private String role;
	private Departments department;
	private int departmentId;
	public InternalUsersDto() {
		super();
	}
	public InternalUsersDto(int userId, String fullname, String email, String username, String role,
			Departments department, int departmentId) {
		super();
		this.userId = userId;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.role = role;
		this.department = department;
		this.departmentId = departmentId;
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
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	

}
