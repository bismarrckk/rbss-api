package com.bizz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="shareholders_biodata")
public class Shareholders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int shareholder_id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String category;
	private long idNumber;
	private String citizenType;
	private String email;
	private String phoneNumber;
	private String officeNumber;
	private String country;
	private String state;
	private String location;
	private String zipcode;
	private String address;
	private String address2;
	private boolean isDirector;
	@JsonBackReference(value="entity-shareholder")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	private Entities entity;
	@JsonManagedReference(value="shareholders-shares")
	@OneToMany(mappedBy="shareholders",cascade = {
	        CascadeType.ALL
	    })
	private List<Shares> shares;
	
	public Shareholders() {
		super();
	}
	public Shareholders(int shareholder_id, String firstName, String middleName, String lastName, String category,
			long idNumber, String citizenType, String email, String phoneNumber, String officeNumber, String country,
			String state, String location, String zipcode, String address, String address2,boolean isDirector, Entities entity,
			List<Shares> shares) {
		super();
		this.shareholder_id = shareholder_id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.category = category;
		this.idNumber = idNumber;
		this.citizenType = citizenType;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.officeNumber = officeNumber;
		this.country = country;
		this.state = state;
		this.location = location;
		this.zipcode = zipcode;
		this.address = address;
		this.address2 = address2;
		this.isDirector=isDirector;
		this.entity = entity;
		this.shares = shares;
	}
	public int getShareholder_id() {
		return shareholder_id;
	}
	public void setShareholder_id(int shareholder_id) {
		this.shareholder_id = shareholder_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
		
	public boolean isDirector() {
		return isDirector;
	}
	public void setDirector(boolean isDirector) {
		this.isDirector = isDirector;
	}
	public Entities getEntity() {
		return entity;
	}
	public void setEntity(Entities entity) {
		this.entity = entity;
	}
	public List<Shares> getShares() {
		return shares;
	}
	public void setShares(List<Shares> shares) {
		this.shares = shares;
	}

	
}
