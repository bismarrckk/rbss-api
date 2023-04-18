package com.bizz.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.AddressDto;
import com.bizz.entity.Address;
import com.bizz.entity.CompanyDetails;
import com.bizz.repository.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService{
@Autowired
AddressRepo addressRepo;
@Autowired
ModelMapper mapper;
@Autowired
CompanyDetailsService companyService;
	@Override
	public Address addAddress(AddressDto addressDto) {
		int id =addressDto.getCompanyId();
		CompanyDetails company=companyService.getCompanyById(id);
		addressDto.setCompany(company);
		Address address=mapper.map(addressDto, Address.class);
		return addressRepo.save(address);
	}

}
