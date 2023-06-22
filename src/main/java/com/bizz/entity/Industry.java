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
@Table(name="industry_type")
public class Industry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int industry_type_id;
	private String description;
	@JsonManagedReference(value="entity-industry")
	@OneToMany(mappedBy="industry",cascade = {
	        CascadeType.ALL
	    })
	private List<Entities> entities;
	
	public Industry() {
		super();
	}
	
	

	public Industry(int industry_type_id, String description, List<Entities> entities) {
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
