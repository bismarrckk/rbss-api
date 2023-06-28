package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.UserDto;
import com.bizz.entity.User;

import exception.ResourceNotFoundException;

public interface UserService {
	User addUser(UserDto userDto) throws ResourceNotFoundException;
	User addInternalUser(UserDto userto) throws ResourceNotFoundException;
	User updateUser(UserDto userDto, int id) throws ResourceNotFoundException;
	List<User> getAllUsers();
	void deleteUser(int id) throws ResourceNotFoundException;
	List<User> getUsersByType(String type);
	User getUserById(int id) throws ResourceNotFoundException;
}
