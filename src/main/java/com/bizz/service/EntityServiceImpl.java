package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.EntitiesDto;
import com.bizz.entity.Entities;
import com.bizz.entity.Industry;
import com.bizz.repository.EntityRepo;

import exception.ResourceNotFoundException;

@Service
public class EntityServiceImpl implements EntityService{
@Autowired
EntityRepo entityRepo;
@Autowired
IndustryService industryService;
@Autowired
ModelMapper mapper;
	@Override
	public Entities addEntity(EntitiesDto entityDto) throws ResourceNotFoundException {
		Industry industry=industryService.getById(entityDto.getIndustryId());
		entityDto.setIndustry(industry);
		entityDto.setStatus("Pending");
		Entities entity=mapper.map(entityDto,Entities.class);
		return entityRepo.save(entity);
	}
	
	@Override
	public Entities getEntityById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return entityRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Entity with ID %s not found", id)));
	}
	@Override
	public List<Entities> getAllEntites() {
		// TODO Auto-generated method stub
		List<Entities> entities= entityRepo.findAll();
		return entities;
	}
	@Override
	public void deleteEntity(int id) throws ResourceNotFoundException{
		Optional<Entities> entity=entityRepo.findById(id);
		if(entity.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity with ID %s not found", id));
		}
		entityRepo.deleteById(id);
	}
	@Override
	public Entities updateEntity(EntitiesDto entity, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Entities> entities=entityRepo.findById(id);
		if(entities.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity with ID %s not found", id));
		}
		Entities details=mapper.map(entities, Entities.class);
		return details;
	}

	@Override
	public Entities getByName(String name) {
		// TODO Auto-generated method stub
		return entityRepo.findByEntityName(name);
	}

		
	

}
