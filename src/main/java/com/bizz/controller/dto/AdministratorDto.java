package com.bizz.controller.dto;
import com.bizz.entity.Entities;


public class AdministratorDto {
	private int admin_id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private Entities entity;
	private int entityId;
	public AdministratorDto() {
		super();
	}


	public AdministratorDto(int admin_id, String firstName, String lastName, String userName, String email,
			String password, Entities entity, int entityId) {
		super();
		this.admin_id = admin_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.entity = entity;
		this.entityId = entityId;
	}


	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
