package com.bizz.service;

import java.io.File;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.Files;
import com.bizz.repository.FilesRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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



}
