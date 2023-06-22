package com.bizz.service;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.RiskTemplatesDto;
import com.bizz.controller.dto.TemplatesPerEntity;
import com.bizz.entity.EntityType;
import com.bizz.entity.RiskTemplates;
import com.bizz.repository.RiskTemplatesRepo;

import exception.ResourceNotFoundException;

@Service
public class RiskTemplateServiceImpl implements RiskTemplateService{
	@Autowired
	RiskTemplatesRepo templateRepo;
	@Autowired
	EntityTypeService typeService;
	@Autowired
	ModelMapper mapper;
	@Override
	public RiskTemplates addTemplate(RiskTemplatesDto templatesDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		EntityType type=typeService.getTypeById(templatesDto.getEntityTypeId());
		templatesDto.setEntyType(type);
		Date date=new Date();
		templatesDto.setDateCreated(date);
		RiskTemplates template=mapper.map(templatesDto,RiskTemplates.class);
		return templateRepo.save(template);
	}

	@Override
	public RiskTemplates getTemplateById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return templateRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Risk template with ID %s not found", id)));
	}

	@Override
	public List<RiskTemplates> getAllTemplates() {
		// TODO Auto-generated method stub
		return templateRepo.findAll();
	}

	@Override
	public void deleteTemplate(int id) throws ResourceNotFoundException {
		RiskTemplates template=templateRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Risk template with ID %s not found", id)));
		templateRepo.delete(template);
	
	}

	@Override
	public RiskTemplates updateTemplate(RiskTemplatesDto templatesDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		RiskTemplates template=templateRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Risk template with ID %s not found", id)));
		template=mapper.map(templatesDto,RiskTemplates.class);
		return template;
	}

	@Override
	public List<TemplatesPerEntity> getTemplatesById(int id) {
		return templateRepo.templatesPerEntity(id);
		
	}

}
