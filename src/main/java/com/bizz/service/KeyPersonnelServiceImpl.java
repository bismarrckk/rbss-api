package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.KeyPersonnelDto;
import com.bizz.entity.Entities;
import com.bizz.entity.KeyPersonnel;
import com.bizz.entity.KeyPersonnelType;
import com.bizz.repository.KeyPersonnelRepo;

import exception.ResourceNotFoundException;
@Service
public class KeyPersonnelServiceImpl implements KeyPersonnelService{
	@Autowired
	ModelMapper mapper;
	@Autowired
	KeyPersonnelRepo personnelRepo;
	@Autowired
	EntityService entityService;
	@Autowired
	KeyPersonnelTypeService typeService;
	@Override
	public KeyPersonnel addKeyPersonnel(KeyPersonnelDto keyPersonnelDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Entities entity=entityService.getEntityById(keyPersonnelDto.getEntityId());
		keyPersonnelDto.setEntity(entity);
		KeyPersonnelType type=typeService.getById(keyPersonnelDto.getPersonnelTypeId());
		keyPersonnelDto.setKeyPersonnelType(type);
		KeyPersonnel personnel=mapper.map(keyPersonnelDto,KeyPersonnel.class);
		return personnelRepo.save(personnel);
	}

	@Override
	public KeyPersonnel updateKeyPersonnel(KeyPersonnelDto keyPersonnelDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<KeyPersonnel> personnel=personnelRepo.findById(id);
		if(personnel.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Key Personnel with ID %s not found", id));
		}
		KeyPersonnel personnell=mapper.map(keyPersonnelDto, KeyPersonnel.class);
		return personnell;
	}

	@Override
	public List<KeyPersonnel> getAllKeyPersonnel() {
		// TODO Auto-generated method stub
		return personnelRepo.findAll();
	}

	@Override
	public void deleteKeyPersonnel(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<KeyPersonnel> personnel =personnelRepo.findById(id);
		if(personnel.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Key Personnel with ID %s not found", id));
		}
		personnelRepo.deleteById(id);
		
	}

}
