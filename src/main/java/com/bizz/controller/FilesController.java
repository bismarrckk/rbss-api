package com.bizz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.InputStreamResource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.Entities;
import com.bizz.entity.Files;
import com.bizz.service.EntityService;
import com.bizz.service.FileService;

import exception.ResourceNotFoundException;
import utility.FileUploadUtil;


@RestController
@RequestMapping("/api/files")
@CrossOrigin("*")
public class FilesController {
@Autowired
FileService fileService;
@Autowired
EntityService entityService;
@Autowired
ModelMapper mapper;
@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
public ResponseEntity<Files> uploadFile(@RequestParam("template") MultipartFile multipartFile,
		@RequestParam("entityId") String entityId) throws IOException, ResourceNotFoundException{
	String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
	
    long size = multipartFile.getSize(); 
    int id=Integer.parseInt(entityId);
    Entities entity=entityService.getEntityById(id);
    String filecode = FileUploadUtil.saveFile(fileName, multipartFile,entity.getEntityName(),"documents");
 
    if(size>100000) {
    	System.out.println("File too large");
    }
   
   
    FilesDto fileDto=new FilesDto();
    
    fileDto.setEntity(entity);
    fileDto.setFileName(fileName);
    fileDto.setDownloadUri("uploads/"+filecode);
    fileDto.setSize(size);
    fileService.addFiles(fileDto);
    
    Files file=mapper.map(fileDto, Files.class);
    return new ResponseEntity<>(file, HttpStatus.OK);
    
}
@GetMapping
public List<Files> getFiles() {
	return fileService.getAllFiles();
}
@GetMapping("/download/{id}")
public ResponseEntity<InputStreamResource> download(@PathVariable int id) throws IOException, ResourceNotFoundException {
	Files files = fileService.getById(id);
	String fileName=files.getFileName();
	String fileBasePath="C:\\Users\\bmetet\\eclipse-workspace\\rbss\\uploads\\";
	File file = new File(fileBasePath + fileName);	 
	
	HttpHeaders header = new HttpHeaders();
    header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"");
    header.add("Cache-Control", "no-cache, no-store, must-revalidate");
    header.add("Pragma", "no-cache");
    header.add("Expires", "0");
    
    
    InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

    return ResponseEntity.ok()
            .headers(header)
            .contentLength(file.length())
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(resource);    
	        
}
}
