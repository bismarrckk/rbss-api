package com.bizz.controller.dto;

import com.bizz.entity.CompanyDetails;

public class AddressDto {
	private int id;
	private String postalAddress;
	private String  country;
	private String  town;
	private String  road;
	private String  registeredOffice;
	private String  building;
	private String  officeNumber;
	private String  county;
	private CompanyDetails company; 
	private int companyId;
	
	public AddressDto() {
		super();
	}

	public AddressDto(int id, String postalAddress, String country, String town, String road, String registeredOffice,
			String building, String officeNumber, String county, CompanyDetails company, int companyId) {
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
		this.companyId = companyId;
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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	
}
