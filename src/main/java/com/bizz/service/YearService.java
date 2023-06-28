package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.YearsDto;
import com.bizz.entity.Years;

import exception.ResourceNotFoundException;

public interface YearService {
	Years addYear(YearsDto yearsDto);
	Years updateYear(YearsDto yearsDto,int id) throws ResourceNotFoundException;
	List<Years> getAll();
	
}
