package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.CompanyDetailsDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.repository.CompanyDetailsRepo;

import exception.ResourceNotFoundException;

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
	public CompanyDetails getCompanyById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return companyRepo.findById(id).orElseThrow(() -> new  ResourceNotFoundException(String.format("Company with ID %s not found", id)));
	}
	@Override
	public List<CompanyDetails> getAllCompanies() {
		// TODO Auto-generated method stub
		List<CompanyDetails> companies= companyRepo.findAll();
		return companies;
	}
	@Override
	public void deleteCompany(int id) throws ResourceNotFoundException{
		Optional<CompanyDetails> company=companyRepo.findById(id);
		if(company.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Company with ID %s not found", id));
		}
		companyRepo.deleteById(id);
	}
	@Override
	public CompanyDetails updateCompany(CompanyDetailsDto company, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<CompanyDetails> companyDetails=companyRepo.findById(id);
		if(companyDetails.isEmpty()) {
			throw new ResourceNotFoundException(String.format("Company with ID %s not found", id));
		}
		CompanyDetails details=mapper.map(company, CompanyDetails.class);
		return details;
	}

}
