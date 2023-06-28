package com.bizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.SharesDto;
import com.bizz.entity.Shares;
import com.bizz.service.ShareService;

import exception.ResourceNotFoundException;
@RequestMapping("/api/shares")
@CrossOrigin("*")
@RestController
public class SharesController {
	@Autowired
	ShareService shareService;
	@PostMapping
	public Shares addShares(@RequestBody SharesDto sharesDto) {
		return shareService.addShares(sharesDto);
	}
	@GetMapping
	public List<Shares> getShares() {
		return shareService.getShares();
	}
	@PutMapping
	public Shares updateShares(@PathVariable int id,@RequestBody SharesDto sharesDto) 
			throws ResourceNotFoundException {
		return shareService.updateShares(sharesDto, sharesDto.getId());
	}
	@DeleteMapping("{id}")
	public void deleteShares(@PathVariable int id) throws ResourceNotFoundException {
		shareService.deleteShares(id);
	}
}
