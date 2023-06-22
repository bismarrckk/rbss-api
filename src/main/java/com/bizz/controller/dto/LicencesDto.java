package com.bizz.controller.dto;



import com.bizz.entity.Entities;
import com.bizz.entity.EntityType;


public class LicencesDto {
	private int licenceId;
	private Entities entity;
	private String licenseNo;
	private EntityType entityType;
	private int entityTypeId;
	private int entityId;
	
	public LicencesDto() {
		super();
	}

	

	public LicencesDto(int licenceId, Entities entity, String licenseNo, EntityType entityType, int entityTypeId,
			int entityId) {
		super();
		this.licenceId = licenceId;
		this.entity = entity;
		this.licenseNo = licenseNo;
		this.entityType = entityType;
		this.entityTypeId = entityTypeId;
		this.entityId = entityId;
	}



	public int getLicenceId() {
		return licenceId;
	}

	public void setLicenceId(int licenceId) {
		this.licenceId = licenceId;
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}



	public int getEntityTypeId() {
		return entityTypeId;
	}



	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}



	public int getEntityId() {
		return entityId;
	}



	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	
	
}
