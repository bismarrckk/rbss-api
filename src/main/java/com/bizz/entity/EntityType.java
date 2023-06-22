package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="entity_type")
public class EntityType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int entity_type_id;
	private String entity_type_name;
	@JsonBackReference(value="category-type")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="category_id")
	private EntityCategory category;
	public EntityType() {
		super();
	}
	
	public EntityType(int entity_type_id, String entity_type_name, EntityCategory category) {
		super();
		this.entity_type_id = entity_type_id;
		this.entity_type_name = entity_type_name;
		this.category = category;
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
	
	
	
	
}
