package com.bizz.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.CompanyDetailsDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.repository.CompanyDetailsRepo;

@Service
public class CompanyDetailsImpl implements CompanyDetailsService{
@Autowired
CompanyDetailsRepo companyRepo;
@Autowired
ModelMapper mapper;
	@Override
	public CompanyDetails addCompany(CompanyDetailsDto companyDto) {
		CompanyDetails company=mapper.map(companyDto,CompanyDetails.class);
		return companyRepo.save(company);
	}
	@Override
	public CompanyDetails getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyRepo.findById(id).orElseThrow(() -> new RuntimeException("No data!"));
	}
	@Override
	public List<CompanyDetails> getAllCompanies() {
		// TODO Auto-generated method stub
		List<CompanyDetails> companies= companyRepo.findAll();
		return companies;
	}

}
