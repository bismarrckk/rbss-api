package com.bizz.controller.dto;

import com.bizz.entity.Entities;

public class RiskUploadsEntityName {
	private int riskUploadsId;
	private String fileName;
	private String downloadUri;
	private String financialYear; 
	private String period;
	private Entities entity;
	private int entityId;
	private String entityName;
	public RiskUploadsEntityName() {
		super();
	}
	

	public RiskUploadsEntityName(int riskUploadsId, String fileName, String downloadUri, String financialYear,
			String period, Entities entity, int entityId, String entityName) {
		super();
		this.riskUploadsId = riskUploadsId;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.financialYear = financialYear;
		this.period = period;
		this.entity = entity;
		this.entityId = entityId;
		this.entityName = entityName;
	}


	public int getRiskUploadsId() {
		return riskUploadsId;
	}
	public void setRiskUploadsId(int riskUploadsId) {
		this.riskUploadsId = riskUploadsId;
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
	public String getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Entities getEntity() {
		return entity;
	}



	public void setEntity(Entities entity) {
		this.entity = entity;
	}



	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	public int getEntityId() {
		return entityId;
	}


	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}


	
	
}
