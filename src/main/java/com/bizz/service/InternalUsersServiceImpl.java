package com.bizz.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.InternalUsersDto;
import com.bizz.entity.Departments;
import com.bizz.entity.InternalUsers;
import com.bizz.repository.InternalUsersRepo;

import exception.ResourceNotFoundException;

@Service
public class InternalUsersServiceImpl implements InternalUsersService{
	@Autowired
	InternalUsersRepo usersRepo;
	@Autowired
	ModelMapper mapper;
	@Autowired
	DepartmentsService depService;
	
	@Override
	public InternalUsers addUser(InternalUsersDto usersDto) throws ResourceNotFoundException {
		Departments department=depService.getDepartmentById(usersDto.getDepartmentId());
		usersDto.setDepartment(department);
		InternalUsers users=mapper.map(usersDto,InternalUsers.class);
		return users;
	}

	@Override
	public InternalUsers getUserById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return usersRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Internal user with ID %s not found", id)));
	}

	@Override
	public List<InternalUsers> getAllUsers() {
		// TODO Auto-generated method stub
		return usersRepo.findAll();
	}

	@Override
	public void deleteUsers(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		InternalUsers user=usersRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Department with ID %s not found", id)));
		usersRepo.delete(user);
	}

	@Override
	public InternalUsers updateUser(InternalUsersDto user, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		InternalUsers userr=usersRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Department with ID %s not found", id)));
		 userr=mapper.map(user, InternalUsers.class);
		 return usersRepo.save(userr);
	}

}
