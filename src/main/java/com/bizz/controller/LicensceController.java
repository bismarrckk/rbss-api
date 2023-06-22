package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.LicencesDto;
import com.bizz.entity.Licences;
import com.bizz.service.LicenceService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/licence")
@CrossOrigin("*")
public class LicensceController {
	@Autowired
	LicenceService licenceService;
	
	@PostMapping
	public Licences add(@RequestBody LicencesDto licencesDto ) throws ResourceNotFoundException{
		return licenceService.addLicence(licencesDto);
	}
	@GetMapping
	public List<Licences> getAll(){
		return licenceService.getAllLicences();
	}
	
}
