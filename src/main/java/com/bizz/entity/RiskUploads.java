package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="risk_uploads")
@CrossOrigin("*")
public class RiskUploads {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int riskUploadsId;
	private String fileName;
	private String downloadUri;
	@JsonBackReference(value="entity-riskUploads")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	private Entities entity;
	private String financialYear; 
	private String period;
	public RiskUploads() {
		super();
	} 
	public RiskUploads(int riskUploadsId, String fileName, String downloadUri, Entities entity, String financialYear,
			String period) {
		super();
		this.riskUploadsId = riskUploadsId;
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.entity = entity;
		this.financialYear = financialYear;
		this.period = period;
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
	
	
}
