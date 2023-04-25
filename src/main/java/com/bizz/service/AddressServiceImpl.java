package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.AddressDto;
import com.bizz.entity.Address;
import com.bizz.entity.CompanyDetails;
import com.bizz.repository.AddressRepo;

import exception.ResourceNotFoundException;

@Service
public class AddressServiceImpl implements AddressService{
@Autowired
AddressRepo addressRepo;
@Autowired
ModelMapper mapper;
@Autowired
CompanyDetailsService companyService;
	@Override
	public Address addAddress(AddressDto addressDto) throws ResourceNotFoundException {
		int id =addressDto.getCompanyId();
		CompanyDetails company=companyService.getCompanyById(id);
		addressDto.setCompany(company);
		Address address=mapper.map(addressDto, Address.class);
		return addressRepo.save(address);
	}
	@Override
	public void deleteAddress(int id) throws ResourceNotFoundException {
		Optional<Address> address=addressRepo.findById(id);
		if(address.isEmpty()) {
			throw new ResourceNotFoundException("Address not found");
		}
		addressRepo.deleteById(id);
	}
	@Override
	public Optional<Address> getAddressById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Address> address=addressRepo.findById(id);
		if(address.isEmpty()) {
			throw new ResourceNotFoundException("Address not found");
		}
		return addressRepo.findById(id);
	}
	@Override
	public Address updateAddress(AddressDto addressDto, int id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		Optional<Address> address=addressRepo.findById(id);
		if(address.isEmpty()) {
			throw new ResourceNotFoundException("Address not found");
		}
		Address addresss=mapper.map(addressDto, Address.class);
		return addressRepo.save(addresss);
	}
	@Override
	public List<Address> getAllAdresses() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}
	

}
