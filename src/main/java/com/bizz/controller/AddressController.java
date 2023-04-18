package com.bizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.AddressDto;
import com.bizz.service.AddressService;

@RestController
@RequestMapping("/api/address")
@CrossOrigin("http://localhost:4200")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping
	public Object addAddress(@RequestBody AddressDto addressDto) {
		return addressService.addAddress(addressDto);
		
	}

}
