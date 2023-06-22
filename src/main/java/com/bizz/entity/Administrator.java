package com.bizz.entity;

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
@Table(name="administrator")
public class Administrator {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int admin_id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;

	@JsonBackReference(value="entity-admin")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	private Entities entity;  
	public Administrator() {
		
	}
	
	
	public Administrator(int admin_id, String firstName, String lastName, String userName, String email,
			String password, Entities entity) {
		super();
		this.admin_id = admin_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
	
		this.entity = entity;
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

	
	
	
}
