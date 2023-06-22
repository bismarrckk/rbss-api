package com.bizz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="entity_category")
public class EntityCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int entity_category_id;
	private String description;
	@JsonManagedReference(value="category-type")
	@OneToMany(mappedBy="category",cascade = {
	        CascadeType.ALL
	    })
	private List<EntityType> entityType;
	public EntityCategory() {
		super();
	}
	
	public EntityCategory(int entity_category_id, String description, List<EntityType> entityType) {
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
