package com.bizz.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.YearsDto;
import com.bizz.entity.Years;
import com.bizz.repository.YearsRepo;

import exception.ResourceNotFoundException;
@Service
public class YearsServiceImpl implements YearService{
	@Autowired
	YearsRepo yearsRepo;
	@Autowired
	ModelMapper mapper;
	@Override
	public Years addYear(YearsDto yearsDto) {
		// TODO Auto-generated method stub
		Years year=mapper.map(yearsDto, Years.class);
		return yearsRepo.save(year);
	}

	@Override
	public Years updateYear(YearsDto yearsDto,int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Years year=yearsRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Year not found"));
		year=mapper.map(yearsDto,Years.class);
		return yearsRepo.save(year);
		
	}

	@Override
	public List<Years> getAll() {
		// TODO Auto-generated method stub
		return yearsRepo.findAll();
	}

}
