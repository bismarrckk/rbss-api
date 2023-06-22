package com.bizz.controller.dto;

import com.bizz.entity.Entities;
import com.bizz.entity.KeyPersonnelType;
public class KeyPersonnelDto {
	
	private int personnel_id;
	private String firstName;
	private String middleName;
	private String lastName;
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
	private String physicalAddress;
	private Entities entity;
	private int entityId;
	private KeyPersonnelType keyPersonnelType;
	private int personnelTypeId;
	private int shares;
	private String certification;
	
	public KeyPersonnelDto() {
		super();
	}

	
	public KeyPersonnelDto(int personnel_id, String firstName, String middleName, String lastName, long idNumber,
			String citizenType, String email, String phoneNumber, String officeNumber, String country, String state,
			String location, String zipcode, String address, String physicalAddress, Entities entity, int entityId,
			KeyPersonnelType keyPersonnelType, int personnelTypeId, int shares, String certification) {
		super();
		this.personnel_id = personnel_id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
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
		this.physicalAddress = physicalAddress;
		this.entity = entity;
		this.entityId = entityId;
		this.keyPersonnelType = keyPersonnelType;
		this.personnelTypeId = personnelTypeId;
		this.shares = shares;
		this.certification = certification;
	}


	public int getPersonnel_id() {
		return personnel_id;
	}

	public void setPersonnel_id(int personnel_id) {
		this.personnel_id = personnel_id;
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
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	
	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
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

	public KeyPersonnelType getKeyPersonnelType() {
		return keyPersonnelType;
	}

	public void setKeyPersonnelType(KeyPersonnelType keyPersonnelType) {
		this.keyPersonnelType = keyPersonnelType;
	}

	public int getPersonnelTypeId() {
		return personnelTypeId;
	}

	public void setPersonnelTypeId(int personnelTypeId) {
		this.personnelTypeId = personnelTypeId;
	}


	public int getShares() {
		return shares;
	}


	public void setShares(int shares) {
		this.shares = shares;
	}


	public String getCertification() {
		return certification;
	}


	public void setCertification(String certification) {
		this.certification = certification;
	}
	
	

}
