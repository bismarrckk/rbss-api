package com.bizz.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bizz.controller.dto.EntityCategoryDto;
import com.bizz.entity.EntityCategory;
import com.bizz.repository.EntityCategoryRepo;

import exception.ResourceNotFoundException;

@Service
public class EntityCategoryServiceImpl implements EntityCategoryService {
	@Autowired
	ModelMapper mapper;
	@Autowired
	EntityCategoryRepo categoryRepo;
	
	@Override
	public EntityCategory addCategory(EntityCategoryDto categoryDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		EntityCategory category=mapper.map(categoryDto, EntityCategory.class);
		return categoryRepo.save(category);
	}

	@Override
	public EntityCategory updateCategory(EntityCategoryDto categoryDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<EntityCategory> category=categoryRepo.findById(id);
		if(category.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity Category with ID %s not found", id));
		}
		EntityCategory cat=mapper.map(categoryDto, EntityCategory.class);
		return cat;
	}

	@Override
	public List<EntityCategory> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public void deleteCategory(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<EntityCategory> category=categoryRepo.findById(id);
		if(category.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity Category with ID %s not found", id));
		}
		categoryRepo.deleteById(id);
		
	}

	@Override
	public EntityCategory getByI(int id) throws ResourceNotFoundException {
		Optional<EntityCategory> category=categoryRepo.findById(id);
		if(category.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Entity Category with ID %s not found", id));
		}
		return categoryRepo.getById(id);
	}

}
