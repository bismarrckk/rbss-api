package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.KeyPersonnelTypeDto;
import com.bizz.entity.KeyPersonnelType;
import com.bizz.repository.KeyPersonnelTypeRepo;

import exception.ResourceNotFoundException;

@Service
public class KeyPersonnelTypeServiceImpl implements KeyPersonnelTypeService {
@Autowired
KeyPersonnelTypeRepo typeRepo;
@Autowired
ModelMapper mapper;

	@Override
	public KeyPersonnelType addPersonnelType(KeyPersonnelTypeDto typeDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		KeyPersonnelType type=mapper.map(typeDto, KeyPersonnelType.class);
		return typeRepo.save(type);
	}

	@Override
	public KeyPersonnelType updateLicence(KeyPersonnelTypeDto typeDto, int id) throws ResourceNotFoundException {
		Optional<KeyPersonnelType> type=typeRepo.findById(id);
		if(type.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Key personnel type with ID %s not found", id));
		}
		KeyPersonnelType personnel=mapper.map(typeDto, KeyPersonnelType.class);
		return personnel;
	}

	@Override
	public List<KeyPersonnelType> getAllKeyPersonnelType() {
		// TODO Auto-generated method stub
		return typeRepo.findAll();
	}

	@Override
	public void deletePersonnelType(int id) throws ResourceNotFoundException {
		Optional<KeyPersonnelType> type=typeRepo.findById(id);
		if(type.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Key personnel type with ID %s not found", id));
		}
		typeRepo.deleteById(id);
		
	}

	@Override
	public KeyPersonnelType getById(int id) throws ResourceNotFoundException {
		return typeRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Key personnel type with ID %s not found", id)));
	}

}
