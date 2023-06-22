package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.SharesDto;
import com.bizz.entity.Shares;

import exception.ResourceNotFoundException;

public interface ShareService {
	Shares addShares(SharesDto sharesDto);
	List<Shares> getShares();
	Shares updateShares(SharesDto sharesDto,int id) throws ResourceNotFoundException;
	void deleteShares(int id) throws ResourceNotFoundException;
}
