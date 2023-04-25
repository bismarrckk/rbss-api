package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.CompanyDetailsDto;
import com.bizz.entity.CompanyDetails;

import exception.ResourceNotFoundException;

public interface CompanyDetailsService {
	
CompanyDetails addCompany(CompanyDetailsDto companyDto);
CompanyDetails getCompanyById(int id) throws ResourceNotFoundException;;
List<CompanyDetails> getAllCompanies();
void deleteCompany(int id) throws ResourceNotFoundException;
CompanyDetails updateCompany(CompanyDetailsDto company,int id) throws ResourceNotFoundException;
}
