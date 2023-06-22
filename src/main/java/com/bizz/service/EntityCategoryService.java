package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.EntityCategoryDto;
import com.bizz.entity.EntityCategory;

import exception.ResourceNotFoundException;

public interface EntityCategoryService {
	EntityCategory addCategory(EntityCategoryDto CategoryDto) throws ResourceNotFoundException;
	EntityCategory updateCategory(EntityCategoryDto CategoryDto, int id) throws ResourceNotFoundException;
	List<EntityCategory> getAllCategories();
	EntityCategory getByI(int id) throws ResourceNotFoundException;
	void deleteCategory(int id) throws ResourceNotFoundException;
}
