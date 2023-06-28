package com.bizz.controller.dto;
import com.bizz.entity.Departments;
import com.bizz.entity.Entities;

public class UserDto {
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String userType;
	private String role;
	private Departments department;
	private int departmentId;
	private String password;
	private int entityId;
	private Entities entity; 
	public UserDto() {
		super();
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

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public UserDto(int userId, String firstName, String lastName, String userName, String email,
			String userType, String role, Departments department, int departmentId, String password, int entityId,
			Entities entity) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.userType = userType;
		this.role = role;
		this.department = department;
		this.departmentId = departmentId;
		this.password = password;
		this.entityId = entityId;
		this.entity = entity;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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


	public int getEntityId() {
		return entityId;
	}


	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	
}
