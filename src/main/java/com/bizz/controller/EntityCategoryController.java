package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.EntityCategoryDto;
import com.bizz.entity.EntityCategory;
import com.bizz.service.EntityCategoryService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/category")
@CrossOrigin("*")
public class EntityCategoryController {
	@Autowired
	EntityCategoryService catService;
	
	@GetMapping
	public List<EntityCategory> getAllCategories() {
		return catService.getAllCategories();
	}
	
	@PostMapping 
	public EntityCategory add(@RequestBody EntityCategoryDto catDto) throws ResourceNotFoundException {
		return catService.addCategory(catDto);
	}
}
