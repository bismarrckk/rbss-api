package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.InternalUsersDto;
import com.bizz.entity.InternalUsers;

import exception.ResourceNotFoundException;

public interface InternalUsersService {
	InternalUsers addUser(InternalUsersDto usersDto) throws ResourceNotFoundException;
	InternalUsers getUserById(int id) throws ResourceNotFoundException;;
	List<InternalUsers> getAllUsers();
	void deleteUsers(int id) throws ResourceNotFoundException;
	InternalUsers updateUser(InternalUsersDto user,int id) throws ResourceNotFoundException;
}
