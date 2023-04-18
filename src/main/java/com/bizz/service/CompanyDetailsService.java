package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.CompanyDetailsDto;
import com.bizz.entity.CompanyDetails;

public interface CompanyDetailsService {
	
CompanyDetails addCompany(CompanyDetailsDto companyDto);
CompanyDetails getCompanyById(int id);
List<CompanyDetails> getAllCompanies();
}
