package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.IndustryDto;
import com.bizz.entity.Industry;

import exception.ResourceNotFoundException;

public interface IndustryService {
	Industry addIndustry(IndustryDto industryDto) throws ResourceNotFoundException;
	Industry updateIndustry(IndustryDto industryDto, int id) throws ResourceNotFoundException;
	List<Industry> getAllIndustries();
	void deleteIndustry(int id) throws ResourceNotFoundException;
	Industry getById(int id) throws ResourceNotFoundException;
}
