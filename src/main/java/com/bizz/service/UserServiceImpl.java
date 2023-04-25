package com.bizz.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.bizz.controller.dto.UserDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.entity.User;
import com.bizz.repository.UserRepo;

import exception.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	UserRepo userRepo;
	@Autowired
	ModelMapper mapper;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	CompanyDetailsService companyService;
	
	@Override
	public User addUser(UserDto userDto) throws ResourceNotFoundException {
		int id=userDto.getCompanyId();
		System.out.println("The id is "+id);
		CompanyDetails company=companyService.getCompanyById(id);
		System.out.println("This is the company"+ company);
		userDto.setCompany(company);
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
	
		User user=mapper.map(userDto, User.class);
		return this.userRepo.save(user);
	}

	@Override
	public void deleteUser(int id) throws ResourceNotFoundException{
		Optional<User> user =userRepo.findById(id);
		if(user.isEmpty()) {
			throw new ResourceNotFoundException(String.format("User with ID %s not found", id));
		}
		userRepo.deleteById(id);
	
		
	}

}
