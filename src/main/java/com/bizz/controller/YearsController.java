package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.YearsDto;
import com.bizz.entity.Years;
import com.bizz.service.YearService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/years")
@CrossOrigin("*")
public class YearsController {
	@Autowired
	YearService yearService;
	
	@PostMapping
	public Years add(@RequestBody YearsDto yearsDto) {
		return yearService.addYear(yearsDto);
	}
	@PutMapping
	public Years update(@RequestBody YearsDto yearsDto) throws ResourceNotFoundException {
		return yearService.updateYear(yearsDto, yearsDto.getYearId());
	}
	@GetMapping
	public List<Years> getAll(){
		return yearService.getAll();
	}
}
