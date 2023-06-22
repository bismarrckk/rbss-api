package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.AdministratorDto;
import com.bizz.entity.Entities;
import com.bizz.entity.Administrator;
import com.bizz.repository.AdminRepo;
import com.bizz.repository.EntityRepo;


import exception.ResourceNotFoundException;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired 
	EntityRepo entityRepo;
	@Autowired
	ModelMapper mapper;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	EntityService entityService;
	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public Administrator addAdministrator(AdministratorDto adminDto) throws ResourceNotFoundException {
		int id=adminDto.getEntityId();
		Entities entity=entityService.getEntityById(id);
		adminDto.setEntity(entity);
		adminDto.setPassword(passwordEncoder.encode(adminDto.getPassword()));
	
		Administrator admin=mapper.map(adminDto, Administrator.class);
		return this.adminRepo.save(admin);
	}

	@Override
	public void deleteAdministrator(int id) throws ResourceNotFoundException{
		Optional<Administrator> admin =adminRepo.findById(id);
		if(admin.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Admin with ID %s not found", id));
		}
		adminRepo.deleteById(id);
	
		
	}

	@Override
	public Administrator updateAdmin(AdministratorDto adminDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Administrator> admin=adminRepo.findById(id);
		if(admin.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Admin with ID %s not found", id));
		}
		Administrator admins=mapper.map(adminDto, Administrator.class);
		return admins;
	}

	@Override
	public List<Administrator> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

}
