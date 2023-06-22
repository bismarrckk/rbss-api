package com.bizz.controller.dto;

import java.sql.Date;
import java.util.List;
import com.bizz.entity.Files;
import com.bizz.entity.Industry;
import com.bizz.entity.KeyPersonnel;
import com.bizz.entity.Licences;
import com.bizz.entity.Shareholders;
import com.bizz.entity.Administrator;

public class EntitiesDto {
	private int entity_id;
	private String entityName;
	private Date incorporationDate;
	private Date endOfFinancialDate;
	private String certNumber;
	private String entityEmail;
	private String entityPhone;
	private String entityPin;
	private String postalAddress;
	private String  country;
	private String  town;
	private String  road;
	private String  registeredOffice;
	private String  physicalAddress;
	private String  officeNumber;
	private String  county;
	private List<Administrator> admin;
	private String status;
	private List<Files> files;
	private List<Shareholders> shareholders;
	private List<KeyPersonnel> personnel;
	private List<Licences> licences;
	private Industry industry;
	private int industryId;
	
	
	public EntitiesDto() {
		super();
	}

	
	public EntitiesDto(int entity_id, String entityName, Date incorporationDate, Date endOfFinancialDate,
			String certNumber, String entityEmail, String entityPhone, String entityPin, String postalAddress,
			String country, String town, String road, String registeredOffice, String physicalAddress,
			String officeNumber, String county, List<Administrator> admin, String status, List<Files> files,
			List<Shareholders> shareholders, List<KeyPersonnel> personnel, List<Licences> licences, Industry industry,
			int industryId) {
		super();
		this.entity_id = entity_id;
		this.entityName = entityName;
		this.incorporationDate = incorporationDate;
		this.endOfFinancialDate = endOfFinancialDate;
		this.certNumber = certNumber;
		this.entityEmail = entityEmail;
		this.entityPhone = entityPhone;
		this.entityPin = entityPin;
		this.postalAddress = postalAddress;
		this.country = country;
		this.town = town;
		this.road = road;
		this.registeredOffice = registeredOffice;
		this.physicalAddress = physicalAddress;
		this.officeNumber = officeNumber;
		this.county = county;
		this.admin = admin;
		this.status = status;
		this.files = files;
		this.shareholders = shareholders;
		this.personnel = personnel;
		this.licences = licences;
		this.industry = industry;
		this.industryId = industryId;
	}



	public int getEntity_id() {
		return entity_id;
	}

	public void setEntity_id(int entity_id) {
		this.entity_id = entity_id;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	public Date getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public Date getEndOfFinancialDate() {
		return endOfFinancialDate;
	}

	public void setEndOfFinancialDate(Date endOfFinancialDate) {
		this.endOfFinancialDate = endOfFinancialDate;
	}

	public String getCertNumber() {
		return certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public String getEntityEmail() {
		return entityEmail;
	}

	public void setEntityEmail(String entityEmail) {
		this.entityEmail = entityEmail;
	}

	public String getEntityPhone() {
		return entityPhone;
	}

	public void setEntityPhone(String entityPhone) {
		this.entityPhone = entityPhone;
	}

	public String getEntityPin() {
		return entityPin;
	}

	public void setEntityPin(String entityPin) {
		this.entityPin = entityPin;
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

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
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

	public List<Administrator> getAdmin() {
		return admin;
	}

	public void setAdmin(List<Administrator> admin) {
		this.admin = admin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Files> getFiles() {
		return files;
	}

	public void setFiles(List<Files> files) {
		this.files = files;
	}

	public List<Shareholders> getShareholders() {
		return shareholders;
	}

	public void setShareholders(List<Shareholders> shareholders) {
		this.shareholders = shareholders;
	}

	public List<KeyPersonnel> getPersonnel() {
		return personnel;
	}

	public void setPersonnel(List<KeyPersonnel> personnel) {
		this.personnel = personnel;
	}

	public Industry getIndustry() {
		return industry;
	}

	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public List<Licences> getLicences() {
		return licences;
	}

	public void setLicences(List<Licences> licences) {
		this.licences = licences;
	}


	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}
	
	
}
