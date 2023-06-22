package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.ShareholdersDto;
import com.bizz.entity.Shareholders;

import exception.ResourceNotFoundException;

public interface ShareholdersService {
	Shareholders addShareholder(ShareholdersDto shareholdersDto);
	Shareholders getShareholderById(int id) throws ResourceNotFoundException;;
	List<Shareholders> getAllShareholders();
	void deleteShareholder(int id) throws ResourceNotFoundException;
	Shareholders updateShareholder(ShareholdersDto shareholderDto,int id) throws ResourceNotFoundException;
}
