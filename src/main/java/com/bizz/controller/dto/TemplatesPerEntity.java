package com.bizz.controller.dto;

import com.bizz.entity.EntityType;

public class TemplatesPerEntity {
	private int riskTemplateId;
	private String fileName;
	private EntityType entityType;

	
	public TemplatesPerEntity() {
		super();
	}


	public TemplatesPerEntity(int riskTemplateId, String fileName, EntityType entityType) {
		super();
		this.riskTemplateId = riskTemplateId;
		this.fileName = fileName;
		this.entityType = entityType;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public int getRiskTemplateId() {
		return riskTemplateId;
	}



	public void setRiskTemplateId(int riskTemplateId) {
		this.riskTemplateId = riskTemplateId;
	}


	public EntityType getEntityType() {
		return entityType;
	}


	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	
	
	
}
