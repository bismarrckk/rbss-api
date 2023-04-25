package com.bizz.controller;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bizz.controller.dto.FilesDto;
import com.bizz.entity.CompanyDetails;
import com.bizz.entity.Files;
import com.bizz.service.CompanyDetailsService;
import com.bizz.service.FileService;

import exception.ResourceNotFoundException;
import utility.FileUploadUtil;

@RestController
@RequestMapping("/api/files")
public class FilesController {
@Autowired
FileService fileService;
@Autowired
CompanyDetailsService companyService;
@Autowired
ModelMapper mapper;
@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
public ResponseEntity<Files> uploadFile(@RequestParam("file") MultipartFile multipartFile,@RequestParam("companyId") String companyId) throws IOException, ResourceNotFoundException{
	String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
    long size = multipartFile.getSize();     
    String filecode = FileUploadUtil.saveFile(fileName, multipartFile);
 
    System.out.print("This is it "+companyId);
    int id=Integer.parseInt(companyId);
    FilesDto fileDto=new FilesDto();
    CompanyDetails company=companyService.getCompanyById(id);
    fileDto.setCompany(company);
    fileDto.setFileName(fileName);
    fileDto.setDownloadUri("/downloadFile/" + filecode);
    fileDto.setSize(size);
    fileService.addFiles(fileDto);
    
    Files file=mapper.map(fileDto, Files.class);
    return new ResponseEntity<>(file, HttpStatus.OK);
    
}
}
