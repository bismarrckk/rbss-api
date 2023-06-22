package com.bizz.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="risk_templates")
public class RiskTemplates {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int riskTemplateId;
	@OneToOne
	@JoinColumn(name = "entity_type_id", referencedColumnName = "entity_type_id")
	private EntityType entyType;
	private String fileName;
	private String downloadUri;
	private Date dateCreated;
	private String financialYear;
	public RiskTemplates() {
		super();
	}
	public RiskTemplates(int riskTemplateId, EntityType entyType, String fileName, String downloadUri,
			Date dateCreated, String financialYear) {
		super();
		this.riskTemplateId = riskTemplateId;
		this.entyType = entyType;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.dateCreated = dateCreated;
		this.financialYear = financialYear;
		
	}
	public int getRiskTemplateId() {
		return riskTemplateId;
	}
	public void setRiskTemplateId(int riskTemplateId) {
		this.riskTemplateId = riskTemplateId;
	}
	public EntityType getentyType() {
		return entyType;
	}
	public void setentyType(EntityType entyType) {
		this.entyType = entyType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDownloadUri() {
		return downloadUri;
	}
	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}
	
	
	
}
