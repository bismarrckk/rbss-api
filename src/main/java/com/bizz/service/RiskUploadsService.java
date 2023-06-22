package com.bizz.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.bizz.controller.dto.RiskUploadsDto;
import com.bizz.controller.dto.RiskUploadsEntityName;
import com.bizz.entity.RiskUploads;

import exception.ResourceNotFoundException;

public interface RiskUploadsService {
	 List< RiskUploads> getAllUploads();
	 RiskUploads addUploads( RiskUploadsDto uploadsDto);
	 RiskUploads getById(int id) throws ResourceNotFoundException;
	 List<RiskUploadsEntityName> getUploadsEntityName();
	 void sendEmail() throws MessagingException, UnsupportedEncodingException;
}
