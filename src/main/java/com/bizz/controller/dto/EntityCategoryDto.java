package com.bizz.controller.dto;

import java.util.List;

import com.bizz.entity.EntityType;


public class EntityCategoryDto {
	
	private int entity_category_id;
	private String description;
	private List<EntityType> entityType;
	
	public EntityCategoryDto() {
		super();
	}

	public EntityCategoryDto(int entity_category_id, String description, List<EntityType> entityType) {
		super();
		this.entity_category_id = entity_category_id;
		this.description = description;
		this.entityType = entityType;
	}



	public int getEntity_category_id() {
		return entity_category_id;
	}

	public void setEntity_category_id(int entity_category_id) {
		this.entity_category_id = entity_category_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EntityType> getEntityType() {
		return entityType;
	}

	public void setEntityType(List<EntityType> entityType) {
		this.entityType = entityType;
	}

	
	

}
