package com.bizz.service;

import com.bizz.controller.dto.UserDto;
import com.bizz.entity.User;

public interface UserService {
	User addUser(UserDto userDto);
}
