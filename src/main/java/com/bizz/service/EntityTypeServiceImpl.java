package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.EntityTypeDto;
import com.bizz.entity.EntityType;
import com.bizz.repository.EntityTypeRepo;

import exception.ResourceNotFoundException;

@Service
public class EntityTypeServiceImpl implements EntityTypeService{
	@Autowired
	ModelMapper mapper;
	@Autowired
	EntityTypeRepo typeRepo;
	
	@Override
	public EntityType addType(EntityTypeDto TypeDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		EntityType type=mapper.map(TypeDto, EntityType.class);
		return typeRepo.save(type);
	}

	@Override
	public EntityType updateType(EntityTypeDto typeDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<EntityType> type=typeRepo.findById(id);
		if(type.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity type with ID %s not found", id));
		}
		EntityType typpe=mapper.map(typeDto, EntityType.class);
		return typpe;
	}

	@Override
	public List<EntityType> getAllTypes() {
		// TODO Auto-generated method stub
		return typeRepo.findAll();
	}

	@Override
	public void deleteType(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<EntityType> type=typeRepo.findById(id);
		if(type.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity type with ID %s not found", id));
		}
		typeRepo.deleteById(id);
		
	}

	@Override
	public EntityType getTypeById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return typeRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Entity type with ID %s not found", id)));
	}
	
}
