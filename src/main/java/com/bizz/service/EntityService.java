package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.EntitiesDto;
import com.bizz.entity.Entities;

import exception.ResourceNotFoundException;

public interface EntityService {
	
Entities addEntity(EntitiesDto entityDto) throws ResourceNotFoundException;
Entities getEntityById(int id) throws ResourceNotFoundException;;
List<Entities> getAllEntites();
void deleteEntity(int id) throws ResourceNotFoundException;
Entities updateEntity(EntitiesDto entity,int id) throws ResourceNotFoundException;
Entities getByName(String name);
}
