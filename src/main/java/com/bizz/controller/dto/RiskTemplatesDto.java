package com.bizz.controller.dto;

import java.util.Date;
import com.bizz.entity.EntityType;

public class RiskTemplatesDto {
	private int riskTemplateId;
	private EntityType entyType;
	private String fileName;
	private String downloadUri;
	private Date dateCreated;
	private String financialYear;
	private int entityTypeId;
	public RiskTemplatesDto() {
		super();
	}
	
	public RiskTemplatesDto(int riskTemplateId, EntityType entyType, String fileName, String downloadUri,
			Date dateCreated, String financialYear, int entityTypeId) {
		super();
		this.riskTemplateId = riskTemplateId;
		this.entyType = entyType;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.dateCreated = dateCreated;
		this.financialYear = financialYear;
		this.entityTypeId = entityTypeId;
	}

	public int getRiskTemplateId() {
		return riskTemplateId;
	}
	public void setRiskTemplateId(int riskTemplateId) {
		this.riskTemplateId = riskTemplateId;
	}

	public EntityType getEntyType() {
		return entyType;
	}

	public void setEntyType(EntityType entyType) {
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
	public int getEntityTypeId() {
		return entityTypeId;
	}
	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}
	
		

}
