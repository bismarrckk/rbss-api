package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.DepartmentsDto;
import com.bizz.entity.Departments;

import exception.ResourceNotFoundException;

public interface DepartmentsService {
	Departments addDepartment(DepartmentsDto departmentDto);
	Departments getDepartmentById(int id) throws ResourceNotFoundException;;
	List<Departments> getAllDepartments();
	void deleteDepartment(int id) throws ResourceNotFoundException;
	Departments updateDepartment(DepartmentsDto department,int id) throws ResourceNotFoundException;

}
