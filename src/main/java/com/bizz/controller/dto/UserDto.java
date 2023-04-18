package com.bizz.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.bizz.entity.CompanyDetails;

public class UserDto {
	private int id;
	@NotEmpty(message = "Firstname should not be null")
	@Size(min = 4, message = "Firstname should have at least 4 characters")
	private String firstName;
	@Size(min = 4, message = "Lastname should have at least 4 characters")
	private String lastName;
	@Size(min = 4, message = "Username should have at least 4 characters")
	private String userName;
	@Email
	private String email;
	@NotEmpty(message = "Password should not be null")
	@Size(min = 8, message = "Password should have at least 8 characters")
	private String password;
	private String role;
	private int companyId; 
	private CompanyDetails company;
	
	public UserDto() {
		super();
	}
	public UserDto(int id,
			@NotEmpty(message = "Firstname should not be null") @Size(min = 4, message = "Firstname should have at least 4 characters") String firstName,
			@Size(min = 4, message = "Lastname should have at least 4 characters") String lastName,
			@Size(min = 4, message = "Username should have at least 4 characters") String userName, @Email String email,
			@NotEmpty(message = "Password should not be null") @Size(min = 8, message = "Password should have at least 8 characters") String password,
			String role, int companyId, CompanyDetails company) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.companyId = companyId;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public CompanyDetails getCompany() {
		return company;
	}
	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	
	
	
}
