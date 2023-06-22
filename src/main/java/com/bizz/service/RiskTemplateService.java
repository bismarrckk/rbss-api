package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.RiskTemplatesDto;
import com.bizz.controller.dto.TemplatesPerEntity;
import com.bizz.entity.RiskTemplates;

import exception.ResourceNotFoundException;

public interface RiskTemplateService {
	RiskTemplates addTemplate(RiskTemplatesDto templatesDto) throws ResourceNotFoundException;
	RiskTemplates getTemplateById(int id) throws ResourceNotFoundException;;
	List<RiskTemplates> getAllTemplates();
	void deleteTemplate(int id) throws ResourceNotFoundException;
	RiskTemplates updateTemplate(RiskTemplatesDto templatesDto,int id) throws ResourceNotFoundException;
	List<TemplatesPerEntity> getTemplatesById(int id);
}
