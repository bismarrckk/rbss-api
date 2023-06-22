package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.IndustryDto;
import com.bizz.entity.Industry;
import com.bizz.repository.IndustryRepo;

import exception.ResourceNotFoundException;
@Service
public class IndustryServiceImpl implements IndustryService{
	@Autowired
	ModelMapper mapper;
	@Autowired
	IndustryRepo industryRepo;
	@Override
	public Industry addIndustry(IndustryDto industryDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Industry industry=mapper.map(industryDto,Industry.class);
		return industryRepo.save(industry);
	}

	@Override
	public Industry updateIndustry(IndustryDto industryDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
	
		Optional<Industry> industry=industryRepo.findById(id);
		if(industry.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Industry with ID %s not found", id));
		}
		Industry industryy=mapper.map(industryDto, Industry.class);
		return industryy;
	}

	@Override
	public List<Industry> getAllIndustries() {
		// TODO Auto-generated method stub
		return industryRepo.findAll();
	}

	@Override
	public void deleteIndustry(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Industry> industry=industryRepo.findById(id);
		if(industry.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Industry with ID %s not found", id));
		}
		industryRepo.deleteById(id);
		
	}

	@Override
	public Industry getById(int id) throws ResourceNotFoundException {
		return industryRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Industry with ID %s not found", id)));
	}
	
}
