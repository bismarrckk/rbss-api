package com.bizz.entity;

import java.sql.Date;
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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="entities")
public class Entities {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int entity_id;
private String entityName;
private Date incorporationDate;
private Date endOfFinancialDate;
private String certNumber;
@JsonManagedReference(value="entity-licence")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })
private List<Licences> licences;
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


@JsonManagedReference(value="entity-admin")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })
private List<User> admin;

private String status;
@JsonManagedReference(value="entity-files")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })
private List<Files> files;

@JsonManagedReference(value="entity-shareholder")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })
private List<Shareholders> shareholders;


@JsonManagedReference(value="entity-personnel")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })
private List<KeyPersonnel> personnel;

@ManyToOne(fetch=FetchType.EAGER)
@JsonBackReference(value="entity-industry")
@JoinColumn(name="industry_id")
private Industry industry;
@JsonManagedReference(value="entity-riskUploads")
@OneToMany(mappedBy="entity",cascade = {
        CascadeType.ALL
    })

private List<RiskUploads> riskUploads;


public Entities() {
	super();
}

public Entities(int entity_id, String entityName, Date incorporationDate, Date endOfFinancialDate, String certNumber,
		List<Licences> licences, String entityEmail, String entityPhone, String entityPin, String postalAddress,
		String country, String town, String road, String registeredOffice, String physicalAddress, String officeNumber,
		String county, List<User> admin, String status, List<Files> files, List<Shareholders> shareholders,
		List<KeyPersonnel> personnel, Industry industry, List<RiskUploads> riskUploads) {
	super();
	this.entity_id = entity_id;
	this.entityName = entityName;
	this.incorporationDate = incorporationDate;
	this.endOfFinancialDate = endOfFinancialDate;
	this.certNumber = certNumber;
	this.licences = licences;
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
	this.industry = industry;
	this.riskUploads = riskUploads;
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

public Industry getIndustry() {
	return industry;
}

public void setIndustry(Industry industry) {
	this.industry = industry;
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

public List<User> getAdmin() {
	return admin;
}

public void setAdmin(List<User> admin) {
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
public List<Licences> getLicences() {
	return licences;
}
public void setLicences(List<Licences> licences) {
	this.licences = licences;
}
public String getPhysicalAddress() {
	return physicalAddress;
}
public void setPhysicalAddress(String physicalAddress) {
	this.physicalAddress = physicalAddress;
}

public List<RiskUploads> getRiskUploads() {
	return riskUploads;
}

public void setRiskUploads(List<RiskUploads> riskUploads) {
	this.riskUploads = riskUploads;
}



}
