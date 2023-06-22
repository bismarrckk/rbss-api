package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.IndustryDto;
import com.bizz.entity.Industry;
import com.bizz.service.IndustryService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/industry") 
@CrossOrigin("*")
public class IndustryController {
	@Autowired
	IndustryService industryService;
	
	@GetMapping
	public List<Industry> getAllIndustries() {
		return industryService.getAllIndustries();
	}
	@PostMapping
	public Industry add(@RequestBody IndustryDto industryDto) throws ResourceNotFoundException {
		return industryService.addIndustry(industryDto);
	}
}
