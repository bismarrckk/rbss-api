package com.bizz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="licences")
public class Licences {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int licenceId;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	@JsonBackReference(value="entity-licence")
	private Entities entity;
	private String licenseNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "entity_type_id", referencedColumnName = "entity_type_id")
	private EntityType entityType;
	public Licences() {
		super();
	}
	
	public Licences(int licenceId, Entities entity, String licenseNo, EntityType entityType) {
		super();
		this.licenceId = licenceId;
		this.entity = entity;
		this.licenseNo = licenseNo;
		this.entityType = entityType;
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

	
	
}
