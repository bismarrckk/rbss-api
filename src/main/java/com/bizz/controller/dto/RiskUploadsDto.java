package com.bizz.controller.dto;
import com.bizz.entity.Entities;


public class RiskUploadsDto {
	private int riskUploadsId;
	private String fileName;
	private String downloadUri;
	private Entities entity;
	private String financialYear; 
	private String period;
	private int entityId;
	public RiskUploadsDto() {
		super();
	}
	public RiskUploadsDto(int riskUploadsId, String fileName, String downloadUri, Entities entity, String financialYear,
			String period, int entityId) {
		super();
		this.riskUploadsId = riskUploadsId;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.entity = entity;
		this.financialYear = financialYear;
		this.period = period;
		this.entityId = entityId;
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
	public Entities getEntity() {
		return entity;
	}
	public void setEntity(Entities entity) {
		this.entity = entity;
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
	public int getEntityId() {
		return entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	
	
	
	
}
