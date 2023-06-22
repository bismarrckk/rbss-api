package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.KeyPersonnelTypeDto;
import com.bizz.entity.KeyPersonnelType;

import exception.ResourceNotFoundException;

public interface KeyPersonnelTypeService {
	KeyPersonnelType addPersonnelType(KeyPersonnelTypeDto typeDto) throws ResourceNotFoundException;
	KeyPersonnelType updateLicence(KeyPersonnelTypeDto typeDto, int id) throws ResourceNotFoundException;
	List<KeyPersonnelType> getAllKeyPersonnelType();
	KeyPersonnelType getById(int id) throws ResourceNotFoundException;
	void deletePersonnelType(int id) throws ResourceNotFoundException;
}
