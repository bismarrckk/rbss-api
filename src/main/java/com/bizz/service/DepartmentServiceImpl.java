package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.DepartmentsDto;
import com.bizz.entity.Departments;
import com.bizz.entity.Entities;
import com.bizz.repository.DepartmentsRepo;

import exception.ResourceNotFoundException;

@Service
public class DepartmentServiceImpl implements DepartmentsService{
	@Autowired
	DepartmentsRepo depRepo;
	@Autowired
	ModelMapper mapper;
	@Override
	public Departments addDepartment(DepartmentsDto departmentDto) {
		// TODO Auto-generated method stub
		Departments department=mapper.map(departmentDto, Departments.class);
		return depRepo.save(department);
	}

	@Override
	public Departments getDepartmentById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return depRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Department with ID %s not found", id)));
	}

	@Override
	public List<Departments> getAllDepartments() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public void deleteDepartment(int id) throws ResourceNotFoundException {
		Optional<Departments> department=depRepo.findById(id);
		if(department.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Department with ID %s not found", id));
		}
		depRepo.deleteById(id);
	}

	@Override
	public Departments updateDepartment(DepartmentsDto department, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Departments> dept=depRepo.findById(id);
		if(dept.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Department with ID %s not found", id));
		}
		Departments departmentt=mapper.map(department, Departments.class);
				return depRepo.save(departmentt);
	}

	@Override
	public Departments getByName(String name) {
		
		return depRepo.findByDepartmentName(name);
	}

}
