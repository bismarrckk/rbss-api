package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.KeyPersonnelDto;
import com.bizz.entity.KeyPersonnel;

import exception.ResourceNotFoundException;

public interface KeyPersonnelService {
	KeyPersonnel addKeyPersonnel(KeyPersonnelDto keyPersonnelDto) throws ResourceNotFoundException;
	KeyPersonnel updateKeyPersonnel(KeyPersonnelDto keyPersonnelDto, int id) throws ResourceNotFoundException;
	List<KeyPersonnel> getAllKeyPersonnel();
	void deleteKeyPersonnel(int id) throws ResourceNotFoundException;
}
