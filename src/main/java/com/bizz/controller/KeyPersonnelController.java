package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.KeyPersonnelDto;
import com.bizz.entity.KeyPersonnel;
import com.bizz.service.KeyPersonnelService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/keyPersonnel")
@CrossOrigin("*")
public class KeyPersonnelController {
	@Autowired
	KeyPersonnelService personnelService;
	
	@PostMapping
	public KeyPersonnel add(@RequestBody KeyPersonnelDto personnelDto) throws ResourceNotFoundException {
		return personnelService.addKeyPersonnel(personnelDto);
	}
	
	@GetMapping
	public List<KeyPersonnel> getAll(){
		return personnelService.getAllKeyPersonnel();
	}
}
