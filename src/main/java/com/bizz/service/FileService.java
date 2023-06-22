package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.Files;

import exception.ResourceNotFoundException;

public interface FileService {
List<Files> getAllFiles();
Files addFiles(FilesDto fileDto);
Files getById(int id) throws ResourceNotFoundException;
}
