package com.bizz.controller.dto;

import java.util.List;

import com.bizz.entity.Entities;


public class IndustryDto {
	private int industry_type_id;
	private String description;
	private List<Entities> entities;
	
	
	public IndustryDto() {
		super();
	}


	public IndustryDto(int industry_type_id, String description, List<Entities> entities) {
		super();
		this.industry_type_id = industry_type_id;
		this.description = description;
		this.entities = entities;
	}


	public int getIndustry_type_id() {
		return industry_type_id;
	}


	public void setIndustry_type_id(int industry_type_id) {
		this.industry_type_id = industry_type_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Entities> getEntities() {
		return entities;
	}


	public void setEntities(List<Entities> entities) {
		this.entities = entities;
	}


	
	
}
