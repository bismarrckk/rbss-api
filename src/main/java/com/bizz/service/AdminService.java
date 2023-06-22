package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.AdministratorDto;
import com.bizz.entity.Administrator;

import exception.ResourceNotFoundException;

public interface AdminService {
	Administrator addAdministrator(AdministratorDto adminDto) throws ResourceNotFoundException;
	Administrator updateAdmin(AdministratorDto adminDto, int id) throws ResourceNotFoundException;
	List<Administrator> getAllAdmins();
	void deleteAdministrator(int id) throws ResourceNotFoundException;
}
