package com.bizz.service;


import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.Files;
import com.bizz.entity.Industry;
import com.bizz.repository.FilesRepo;

import exception.ResourceNotFoundException;

@Service
public class FileServiceImpl implements FileService{
@Autowired
FilesRepo fileRepo;
@Autowired
ModelMapper mapper;

	@Override
	public List<Files> getAllFiles() {
		// TODO Auto-generated method stub
		return fileRepo.findAll();
	}

	@Override
	public Files addFiles(FilesDto fileDto) {
		// TODO Auto-generated method stub
		Files file=mapper.map(fileDto, Files.class);
		return fileRepo.save(file);
	}

	@Override
	public Files getById(int id) throws ResourceNotFoundException {
		Optional<Files> file=fileRepo.findById(id);
		if(file.isEmpty()) {
			throw new ResourceNotFoundException(String.format("File with ID %s not found", id));
		}
		return fileRepo.getById(id);
	}



}
