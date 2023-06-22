package com.bizz.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.SharesDto;
import com.bizz.entity.Shares;
import com.bizz.repository.SharesRepo;

import exception.ResourceNotFoundException;

@Service
public class SharesImpl implements ShareService{
	@Autowired
	SharesRepo shareRepo;
	@Autowired
	ModelMapper mapper;
	
	@Override
	public Shares addShares(SharesDto sharesDto) {
		// TODO Auto-generated method stub
		Shares shares=mapper.map(sharesDto, Shares.class);
		return shareRepo.save(shares);
	}

	@Override
	public List<Shares> getShares() {
		// TODO Auto-generated method stub
		return shareRepo.findAll();
	}

	@Override
	public Shares updateShares(SharesDto sharesDto, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Shares> shares=shareRepo.findById(id);
		if(shares.isEmpty()) {
			throw new ResourceNotFoundException("Shares not found!!");
		}
		Shares share=mapper.map(sharesDto, Shares.class);
		return shareRepo.save(share);
	}

	@Override
	public void deleteShares(int id) throws ResourceNotFoundException {
		Optional<Shares> shares=shareRepo.findById(id);
		if(shares.isEmpty()) {
			throw new ResourceNotFoundException("Shares not found!!");
		}
		shareRepo.deleteById(id);
		
	}
	
}
