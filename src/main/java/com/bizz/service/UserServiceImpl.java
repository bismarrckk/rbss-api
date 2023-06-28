package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.UserDto;
import com.bizz.entity.Entities;
import com.bizz.entity.User;
import com.bizz.entity.Departments;
import com.bizz.repository.UserRepo;
import com.bizz.repository.DepartmentsRepo;
import com.bizz.repository.EntityRepo;


import exception.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	EntityRepo entityRepo;
	@Autowired
	ModelMapper mapper;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	EntityService entityService;
	@Autowired
	UserRepo userRepo;
	@Autowired
	DepartmentsService depService;
	
	@Override
	public User addUser(UserDto userDto) throws ResourceNotFoundException {
		int id=userDto.getEntityId();
		Entities entity=entityService.getEntityById(id);
		Departments department=depService.getByName("N/A");
		
		userDto.setEntity(entity);
		userDto.setDepartment(department);
		userDto.setUserType("external");
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
	
		User user=mapper.map(userDto, User.class);
		return this.userRepo.save(user);
	}
	@Override
	public User addInternalUser(UserDto userDto) throws ResourceNotFoundException {
		int depId=userDto.getDepartmentId();
		Departments department=depService.getDepartmentById(depId);
		userDto.setDepartment(department);
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
		//Entities entity=entityService.getByName("N/A");
		Entities entity=entityService.getByName("internal_use");
		userDto.setEntity(entity);
		User user=mapper.map(userDto, User.class);
		return this.userRepo.save(user);
	}


	@Override
	public void deleteUser(int id) throws ResourceNotFoundException{
		Optional<User> admin =userRepo.findById(id);
		if(admin.isEmpty()) {
			throw new ResourceNotFoundException(String.format("User with ID %s not found", id));
		}
		userRepo.deleteById(id);
	
		
	}

	@Override
	public User updateUser(UserDto userDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepo.findById(id);
		if(user.isEmpty()) {
			throw new ResourceNotFoundException(String.format("User with ID %s not found", id));
		}
		User admins=mapper.map(userDto, User.class);
		return admins;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public List<User> getUsersByType(String type) {
		// TODO Auto-generated method stub
		return userRepo.findByType(type);
	}
	@Override
	public User getUserById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found!"));
	}


}
