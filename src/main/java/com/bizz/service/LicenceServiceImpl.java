package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.LicencesDto;
import com.bizz.entity.Entities;
import com.bizz.entity.EntityType;
import com.bizz.entity.Licences;
import com.bizz.repository.LicenceRepo;

import exception.ResourceNotFoundException;

@Service
public class LicenceServiceImpl implements LicenceService {
@Autowired
LicenceRepo licenceRepo;
@Autowired
EntityService entityService;
@Autowired
EntityTypeService typeService;
@Autowired
ModelMapper mapper;
	@Override
	public Licences addLicence(LicencesDto licenceDto) throws ResourceNotFoundException {
		Entities entity=entityService.getEntityById(licenceDto.getEntityId());
		licenceDto.setEntity(entity);
		EntityType type=typeService.getTypeById(licenceDto.getEntityTypeId());
		licenceDto.setEntityType(type);
		Licences licence=mapper.map(licenceDto,Licences.class);
		return licenceRepo.save(licence);
	}

	@Override
	public Licences updateLicence(LicencesDto licenceDto, int id) throws ResourceNotFoundException {
		Optional<Licences> licence=licenceRepo.findById(id);
		if(licence.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Licence with ID %s not found", id));
		}
		Licences license=mapper.map(licenceDto, Licences.class);
		return license;
	}

	@Override
	public List<Licences> getAllLicences() {
		// TODO Auto-generated method stub
		return licenceRepo.findAll();
	}

	@Override
	public void deleteLicence(int id) throws ResourceNotFoundException {
		Optional<Licences> licence=licenceRepo.findById(id);
		if(licence.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Licence with ID %s not found", id));
		}
		licenceRepo.deleteById(id);
		
	}

}
