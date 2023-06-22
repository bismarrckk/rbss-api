package com.bizz.controller.dto;

public class KeyPersonnelTypeDto {
	
	private int personnelTypeId;
	private String personnelType;
	public KeyPersonnelTypeDto() {
		super();
	}
	public KeyPersonnelTypeDto(int personnelTypeId, String personnelType) {
		super();
		this.personnelTypeId = personnelTypeId;
		this.personnelType = personnelType;
	}
	public int getPersonnelTypeId() {
		return personnelTypeId;
	}
	public void setPersonnelTypeId(int personnelTypeId) {
		this.personnelTypeId = personnelTypeId;
	}
	public String getPersonnelType() {
		return personnelType;
	}
	public void setPersonnelType(String personnelType) {
		this.personnelType = personnelType;
	}
	
	

}
