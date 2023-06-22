package com.bizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.EntitiesDto;
import com.bizz.entity.Entities;
import com.bizz.service.EntityService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/entity")
@CrossOrigin("*")
public class EntityController {
@Autowired
EntityService entityService;

@PostMapping
public Entities addEntity(@RequestBody EntitiesDto entityDto) throws ResourceNotFoundException {

	return entityService.addEntity(entityDto);
}
@GetMapping("/{id}")
public Entities getEntityById(@PathVariable(name="id") int id) throws ResourceNotFoundException {
	return entityService.getEntityById(id);
}
@GetMapping
public Object getEntityDetails() {
	return entityService.getAllEntites();
}
@DeleteMapping("{id}")
public void deleteEntity(@PathVariable int id) throws ResourceNotFoundException {
	entityService.deleteEntity(id);
}
@PutMapping
public Entities updateEntity(@RequestBody EntitiesDto entityDto) throws ResourceNotFoundException {

	return entityService.updateEntity(entityDto, entityDto.getEntity_id() );
	
}



}
