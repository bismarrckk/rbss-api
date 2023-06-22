package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.ShareholdersDto;
import com.bizz.entity.Shareholders;
import com.bizz.repository.ShareholdersRepo;

import exception.ResourceNotFoundException;

@Service
public class ShareholderServiceImpl implements ShareholdersService {

	@Autowired
	ShareholdersRepo shareholdersRepo;
	@Autowired
	ModelMapper mapper;
	
	@Override
	public Shareholders addShareholder(ShareholdersDto shareholdersDto) {
		// TODO Auto-generated method stub
		Shareholders shareholder=mapper.map(shareholdersDto, Shareholders.class);
		return this.shareholdersRepo.save(shareholder);
	}

	@Override
	public Shareholders getShareholderById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return shareholdersRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Shareholder with ID %s not found", id)));
	}

	@Override
	public List<Shareholders> getAllShareholders() {
		// TODO Auto-generated method stub
		return shareholdersRepo.findAll();
	}

	@Override
	public void deleteShareholder(int id) throws ResourceNotFoundException {
		Optional<Shareholders> shareholder=shareholdersRepo.findById(id);
		if(shareholder.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Shareholder with ID %s not found", id));
		}
		shareholdersRepo.deleteById(id);
		
	}

	@Override
	public Shareholders updateShareholder(ShareholdersDto shareholderDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Shareholders> shareholder=shareholdersRepo.findById(id);
		if(shareholder.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Shareholder with ID %s not found", id));
		}
		Shareholders shareholderDetails=mapper.map(shareholderDto, Shareholders.class);
		return shareholderDetails;
	}

}
