package com.bizz.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.bizz.controller.dto.UserDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.entity.User;
import com.bizz.repository.UserRepo;

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
	public User addUser(UserDto userDto) {
		int id=userDto.getCompanyId();
		System.out.println("The id is "+id);
		CompanyDetails company=companyService.getCompanyById(id);
		System.out.println("This is the company"+ company);
		userDto.setCompany(company);
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
	
		User user=mapper.map(userDto, User.class);
		return this.userRepo.save(user);
	}

}
