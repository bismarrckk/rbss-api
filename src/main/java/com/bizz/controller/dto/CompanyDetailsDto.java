package com.bizz.controller.dto;

import java.sql.Date;
import java.util.List;

import com.bizz.entity.Address;
import com.bizz.entity.Files;
import com.bizz.entity.User;

public class CompanyDetailsDto {
	private int id;
	private String companyName;
	private String companyType;
	private String industrySector;
	private Date incorporationDate;
	private Date endOfFinancialDate;
	private String certNumber;
	private String companyEmail;
	private String companyPhone;
	private String companyPin;
	private List<User> user;
	private Address address;
	private String status;
	private List<Files> files;
	public CompanyDetailsDto() {
		super();
	}

	public CompanyDetailsDto(int id, String companyName, String companyType, String industrySector,
			Date incorporationDate, Date endOfFinancialDate, String certNumber, String companyEmail,
			String companyPhone, String companyPin, List<User> user, Address address, String status,
			List<Files> files) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companyType = companyType;
		this.industrySector = industrySector;
		this.incorporationDate = incorporationDate;
		this.endOfFinancialDate = endOfFinancialDate;
		this.certNumber = certNumber;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.companyPin = companyPin;
		this.user = user;
		this.address = address;
		this.status = status;
		this.files = files;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getIndustrySector() {
		return industrySector;
	}
	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
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
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyPin() {
		return companyPin;
	}
	public void setCompanyPin(String companyPin) {
		this.companyPin = companyPin;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
	
	
}
