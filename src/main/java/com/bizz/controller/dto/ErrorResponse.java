package com.bizz.controller.dto;

public class ErrorResponse {
 private String status;
 private String message;
 private String error;
public ErrorResponse(String status, String message, String error) {
	super();
	this.status = status;
	this.message = message;
	this.error = error;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
 
 
}
