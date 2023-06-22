package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.KeyPersonnelTypeDto;
import com.bizz.entity.KeyPersonnelType;
import com.bizz.service.KeyPersonnelTypeService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/personnelType")
@CrossOrigin("*")
public class KeyPersonnelTypeController {
	@Autowired
	KeyPersonnelTypeService personnelService;
	
	@PostMapping
	public KeyPersonnelType add(@RequestBody KeyPersonnelTypeDto typeDto) throws ResourceNotFoundException {
		return personnelService.addPersonnelType(typeDto);
	}
	
	@GetMapping
	public List<KeyPersonnelType> getAll(){
		return personnelService.getAllKeyPersonnelType();
	}
}
