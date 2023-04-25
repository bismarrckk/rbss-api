package com.bizz.service;

import java.util.List;
import java.util.Optional;

import com.bizz.controller.dto.AddressDto;
import com.bizz.entity.Address;

import exception.ResourceNotFoundException;

public interface AddressService {
	Address addAddress(AddressDto addressDto) throws ResourceNotFoundException;
	void deleteAddress(int id) throws ResourceNotFoundException;
	Optional<Address> getAddressById(int id) throws ResourceNotFoundException;
	Address updateAddress(AddressDto addressDto,int id) throws ResourceNotFoundException; 
	List<Address> getAllAdresses();
}
