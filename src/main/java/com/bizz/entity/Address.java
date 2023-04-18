package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String postalAddress;
	private String  country;
	private String  town;
	private String  road;
	private String  registeredOffice;
	private String  building;
	private String  officeNumber;
	private String  county;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="company_id")
	@JsonBackReference(value="company-address")
	private CompanyDetails company;
	
	public Address() {
		super();
	}


	public Address(int id, String postalAddress, String country, String town, String road, String registeredOffice,
			String building, String officeNumber, String county, CompanyDetails company) {
		super();
		this.id = id;
		this.postalAddress = postalAddress;
		this.country = country;
		this.town = town;
		this.road = road;
		this.registeredOffice = registeredOffice;
		this.building = building;
		this.officeNumber = officeNumber;
		this.county = county;
		this.company = company;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getRegisteredOffice() {
		return registeredOffice;
	}

	public void setRegisteredOffice(String registeredOffice) {
		this.registeredOffice = registeredOffice;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}


	public CompanyDetails getCompany() {
		return company;
	}


	public void setCompany(CompanyDetails company) {
		this.company = company;
	}
	
	
	

}
