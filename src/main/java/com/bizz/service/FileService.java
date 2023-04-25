package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.Files;

public interface FileService {
List<Files> getAllFiles();
Files addFiles(FilesDto fileDto);

}
