package com.bizz.entity;

import java.util.Date;

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
@Table(name="files")
public class Files {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fileName;
	private long size;
	private String downloadUri;
	@JsonBackReference(value="entity-files")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="entity_id")
	private Entities entity;
	private Date uploadedAt;
	
	
	public Files() {
		super();
	}
	
	

	public Files(int id, String fileName, long size, String downloadUri, Entities entity, Date uploadedAt) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.size = size;
		this.downloadUri = downloadUri;
		this.entity = entity;
		this.uploadedAt = uploadedAt;
	}







	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getDownloadUri() {
		return downloadUri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
	}



	public Date getUploadedAt() {
		return uploadedAt;
	}



	public void setUploadedAt(Date uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	

	
	
	
}
