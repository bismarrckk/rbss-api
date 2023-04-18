package com.bizz.controller.dto;

import com.bizz.entity.CompanyDetails;

public class FilesDto {
private int id;
private String fileName;
private String downloadUri;
private CompanyDetails company;
private long size;

public FilesDto() {
	super();
}


public FilesDto(int id, String fileName, String downloadUri, CompanyDetails company, long size) {
	super();
	this.id = id;
	this.fileName = fileName;
	this.downloadUri = downloadUri;
	this.company = company;
	this.size = size;
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

public CompanyDetails getCompany() {
	return company;
}

public void setCompany(CompanyDetails company) {
	this.company = company;
}


public long getSize() {
	return size;
}


public void setSize(long size) {
	this.size = size;
}


}
