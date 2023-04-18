package com.bizz.service;

import com.bizz.controller.dto.AddressDto;
import com.bizz.entity.Address;

public interface AddressService {
	Address addAddress(AddressDto addressDto);

}
