package com.bizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.CompanyDetailsDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.service.CompanyDetailsService;

@RestController
@RequestMapping("/api/company")
@CrossOrigin("*")
public class CompanyController {
@Autowired
CompanyDetailsService companyService;

@PostMapping
public CompanyDetails addCompany(@RequestBody CompanyDetailsDto companyDto) {
	
	return companyService.addCompany(companyDto);
}
@GetMapping("{id}")
public CompanyDetails getCompanyById(@PathVariable(name="id") int id) {
	return companyService.getCompanyById(id);
}
@GetMapping
public Object getCompanyDetails() {
	return companyService.getAllCompanies();
}
}