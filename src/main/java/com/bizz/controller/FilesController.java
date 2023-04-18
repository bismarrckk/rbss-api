package com.bizz.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bizz.controller.dto.FilesDto;

import utility.FileUploadUtil;

@RestController
@RequestMapping("/api/files")
public class FilesController {
@PostMapping
public ResponseEntity<FilesDto> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException{
	String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
    long size = multipartFile.getSize();
     
    String filecode = FileUploadUtil.saveFile(fileName, multipartFile);
    FilesDto fileDto=new FilesDto();
    fileDto.setFileName(fileName);
    fileDto.setDownloadUri("/downloadFile/" + filecode);
    fileDto.setSize(size);
    return new ResponseEntity<>(fileDto, HttpStatus.OK);
    
}
}
