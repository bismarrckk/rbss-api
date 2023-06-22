package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.DepartmentsDto;
import com.bizz.entity.Departments;
import com.bizz.service.DepartmentsService;

@RestController
@RequestMapping("/api/departments") 
@CrossOrigin("*")
public class DepartmentsController {
	@Autowired
	DepartmentsService depService;
	
	@PostMapping
	public Departments add(@RequestBody DepartmentsDto depDto) {
		return depService.addDepartment(depDto);
	}
	@GetMapping
	public List<Departments> getAll(){
		return depService.getAllDepartments();
	}
}
