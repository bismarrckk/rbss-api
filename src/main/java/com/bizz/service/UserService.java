package com.bizz.service;

import com.bizz.controller.dto.UserDto;
import com.bizz.entity.User;

import exception.ResourceNotFoundException;

public interface UserService {
	User addUser(UserDto userDto) throws ResourceNotFoundException;
	void deleteUser(int id) throws ResourceNotFoundException;
}
