package com.bizz.controller.dto;


import com.bizz.entity.EntityCategory;


public class EntityTypeDto {
	private int entity_type_id;
	private String entity_type_name;
	private EntityCategory category;
	private int categoryId;
	
	public EntityTypeDto() {
		super();
	}
	public EntityTypeDto(int entity_type_id, String entity_type_name, EntityCategory category, int categoryId) {
		super();
		this.entity_type_id = entity_type_id;
		this.entity_type_name = entity_type_name;
		this.category = category;
		this.categoryId = categoryId;
	}



	public int getEntity_type_id() {
		return entity_type_id;
	}

	public void setEntity_type_id(int entity_type_id) {
		this.entity_type_id = entity_type_id;
	}

	public String getEntity_type_name() {
		return entity_type_name;
	}

	public void setEntity_type_name(String entity_type_name) {
		this.entity_type_name = entity_type_name;
	}

	public EntityCategory getCategory() {
		return category;
	}

	public void setCategory(EntityCategory category) {
		this.category = category;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
