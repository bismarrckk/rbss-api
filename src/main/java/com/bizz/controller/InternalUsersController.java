package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.InternalUsersDto;
import com.bizz.entity.InternalUsers;
import com.bizz.service.InternalUsersService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/internalUsers") 
@CrossOrigin("*")
public class InternalUsersController {
	@Autowired
	InternalUsersService userService;
	
	@PostMapping
	public InternalUsers add(@RequestBody InternalUsersDto usersDto) throws ResourceNotFoundException {
		return userService.addUser(usersDto);
	}
	@GetMapping
	public List<InternalUsers> getAll(){
		return userService.getAllUsers();
	}
}
