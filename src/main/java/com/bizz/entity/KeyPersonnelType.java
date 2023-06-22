package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="key_personnel_type")
public class KeyPersonnelType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personnelTypeId;
	private String personnelType;
	
	public KeyPersonnelType() {
		super();
	}
	public KeyPersonnelType(int personnelTypeId, String personnelType) {
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
