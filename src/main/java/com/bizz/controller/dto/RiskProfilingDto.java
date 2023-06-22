package com.bizz.controller.dto;

import java.util.Date;

import com.bizz.entity.Entities;
import com.bizz.entity.EntityType;


public class RiskProfilingDto {
	private int riskProfilingID;
	private Entities entities;
	private String fileName;
	private String downloadUri;
	private Date dateCreated;
	private String financialYear;
	private String period;
	private int entityId;

	public RiskProfilingDto() {
		super();
	}



	public RiskProfilingDto(int riskProfilingID, Entities entities, String fileName,
			String downloadUri, Date dateCreated, String financialYear, String period, int entityId) {
		super();
		this.riskProfilingID = riskProfilingID;
		this.entities = entities;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.dateCreated = dateCreated;
		this.financialYear = financialYear;
		this.period = period;

	}



	public int getRiskProfilingID() {
		return riskProfilingID;
	}
	public void setRiskProfilingID(int riskProfilingID) {
		this.riskProfilingID = riskProfilingID;
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
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
	public Entities getEntities() {
		return entities;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	public int getEntityId() {
		return entityId;
	}


	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}



	

}
