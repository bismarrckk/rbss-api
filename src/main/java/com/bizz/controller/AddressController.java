package com.bizz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.AddressDto;
import com.bizz.entity.Address;
import com.bizz.service.AddressService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/address")
@CrossOrigin("http://localhost:4200")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping
	public Object addAddress(@RequestBody AddressDto addressDto) throws ResourceNotFoundException {
		return addressService.addAddress(addressDto);
		
	}
	@PutMapping
	public Address updateAddress(@RequestBody AddressDto addressDto) throws ResourceNotFoundException {
		return addressService.updateAddress(addressDto,addressDto.getId());
	}
	@GetMapping("{id}")
	public Optional<Address> getAddressById(@PathVariable int id) throws ResourceNotFoundException {
		return addressService.getAddressById(id);
	}
	@GetMapping
	public List<Address> getAllAddresses(){
		return addressService.getAllAdresses();
	}

}
