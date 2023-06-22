package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.EntityTypeDto;
import com.bizz.entity.EntityCategory;
import com.bizz.entity.EntityType;
import com.bizz.service.EntityCategoryService;
import com.bizz.service.EntityTypeService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/type")
@CrossOrigin("*")
public class EntityTypeController {
	@Autowired
	EntityTypeService typeService;
	@Autowired
	EntityCategoryService catService;
	
	@GetMapping
	public List<EntityType> getAll(){
		return typeService.getAllTypes();
	}
	@PostMapping
	public EntityType add(@RequestBody EntityTypeDto typeDto) throws ResourceNotFoundException {
		EntityCategory cat=catService.getByI(typeDto.getCategoryId());
		typeDto.setCategory(cat);
		return typeService.addType(typeDto);
	}
}
