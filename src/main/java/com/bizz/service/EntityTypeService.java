package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.EntityTypeDto;
import com.bizz.entity.EntityType;


import exception.ResourceNotFoundException;

public interface EntityTypeService {
	EntityType addType(EntityTypeDto TypeDto) throws ResourceNotFoundException;
	EntityType updateType(EntityTypeDto TypeDto, int id) throws ResourceNotFoundException;
	List<EntityType> getAllTypes();
	EntityType getTypeById(int id) throws ResourceNotFoundException;
	void deleteType(int id) throws ResourceNotFoundException;
}
