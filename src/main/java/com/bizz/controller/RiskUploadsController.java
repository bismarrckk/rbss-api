package com.bizz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

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

import com.bizz.controller.dto.RiskUploadsDto;
import com.bizz.controller.dto.RiskUploadsEntityName;
import com.bizz.entity.Entities;
import com.bizz.entity.RiskUploads;
import com.bizz.entity.User;
import com.bizz.service.EntityService;
import com.bizz.service.RiskUploadsService;
import com.bizz.service.UserService;

import exception.ResourceNotFoundException;
import utility.FileUploadUtil;
@RestController
@RequestMapping("/api/riskUploads")
@CrossOrigin("*")
public class RiskUploadsController {
	@Autowired
	EntityService entityService;
	@Autowired
	ModelMapper mapper;
	@Autowired
	RiskUploadsService uploadService;
	@Autowired
	UserService userService;
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<RiskUploads> add(@RequestParam("template") MultipartFile multipartFile,
			@RequestParam("entityId") String entityId,@RequestParam("userId") String userId,@RequestParam("period") String period,@RequestParam("financialYear") String financialYear) 
			throws ResourceNotFoundException, IOException, MessagingException{
				
		int entityid=Integer.parseInt(entityId);
		int userIdd=Integer.parseInt(userId);
		User user=userService.getUserById(userIdd);
		Entities entity=entityService.getEntityById(entityid);
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		String filecode = FileUploadUtil.saveFile(fileName, multipartFile,entity.getEntityName(),financialYear);
		
		
		
		RiskUploadsDto uploadsDto=new RiskUploadsDto();
		
		uploadsDto.setEntity(entity);
		uploadsDto.setPeriod(period);
		uploadsDto.setFinancialYear(financialYear);
		uploadsDto.setFileName(financialYear+'_'+entity.getEntityName()+'_'+user.getFirstName());
		uploadsDto.setDownloadUri("uploads/"+filecode);
		
		uploadService.addUploads(uploadsDto);
		uploadService.sendEmail();
		RiskUploads uploadss=mapper.map(uploadsDto, RiskUploads.class);
		return new ResponseEntity<>(uploadss,HttpStatus.OK);
		
	}
	@GetMapping
	public List<RiskUploads> getAll(){
		return uploadService.getAllUploads();
	}
	@GetMapping("/uploadsEntityName")
	public List<RiskUploadsEntityName> getUploadsEntity(){
		return uploadService.getUploadsEntityName();
	}
	@GetMapping("/download/{id}")
	public ResponseEntity<InputStreamResource> download(@PathVariable int id) throws IOException, ResourceNotFoundException {
		RiskUploads files = uploadService.getById(id);
		Entities entity=files.getEntity();
		String entityName=entity.getEntityName();
		String fileName=files.getFileName();
		String fy=files.getFinancialYear();
		String fileBasePath="C:\\Users\\bmetet\\eclipse-workspace\\rbss\\uploads\\";
		File file = new File(fileBasePath +entityName+"\\"+ fy +"\\"+fileName);	 
		
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
