package com.bizz.controller.dto;

import com.bizz.entity.Entities;

public class FilesDto {
private int id;
private String fileName;
private String downloadUri;
private Entities entity;
private long size;
private int entityId;

public FilesDto() {
	super();
}

public FilesDto(int id, String fileName, String downloadUri, Entities entity, long size, int entityId) {
	super();
	this.id = id;
	this.fileName = fileName;
	this.downloadUri = downloadUri;
	this.entity = entity;
	this.size = size;
	this.entityId = entityId;
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

public String getDownloadUri() {
	return downloadUri;
}

public void setDownloadUri(String downloadUri) {
	this.downloadUri = downloadUri;
}



public long getSize() {
	return size;
}


public void setSize(long size) {
	this.size = size;
}

public Entities getEntity() {
	return entity;
}

public void setEntity(Entities entity) {
	this.entity = entity;
}

public int getEntityId() {
	return entityId;
}

public void setEntityId(int entityId) {
	this.entityId = entityId;
}




}
