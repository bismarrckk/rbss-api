package com.bizz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bizz.controller.dto.RiskTemplatesDto;
import com.bizz.controller.dto.TemplatesPerEntity;
import com.bizz.entity.RiskTemplates;
import com.bizz.service.RiskTemplateService;

import exception.ResourceNotFoundException;
import utility.FileUploadUtil;
import utility.TemplatesUploadUtility;

@RestController
@RequestMapping("/api/riskTemplates")
@CrossOrigin("*")
public class RiskTemplatesController {
	@Autowired
	RiskTemplateService templateService;
	@Autowired
	ModelMapper mapper;
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<RiskTemplates> add(@RequestParam("template") MultipartFile multipartFile,
			@RequestParam("entityTypeId") String entityTypeId,@RequestParam("financialYear") String financialYear)
					throws ResourceNotFoundException, IOException {
		
	
		int entitytypeid=Integer.parseInt(entityTypeId);
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		String filecode = TemplatesUploadUtility.saveFile(fileName, multipartFile);
		
		RiskTemplatesDto templateDto=new RiskTemplatesDto();
		
		templateDto.setEntityTypeId(entitytypeid);
		templateDto.setFinancialYear(financialYear);
		templateDto.setFileName(fileName);
		templateDto.setDownloadUri("uploads/"+filecode);
		
	
		templateService.addTemplate(templateDto);
		RiskTemplates templates=mapper.map(templateDto, RiskTemplates.class);
		return new ResponseEntity<>(templates, HttpStatus.OK);
	}
	
	@GetMapping("/download/{id}")
	public ResponseEntity<InputStreamResource> download(@PathVariable int id) throws IOException, ResourceNotFoundException {
		RiskTemplates files = templateService.getTemplateById(id);
		String fileName=files.getFileName();
		String fileBasePath="C:\\Users\\bmetet\\eclipse-workspace\\rbss\\templates\\";
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
	@GetMapping
	public List<RiskTemplates> getAll(){
		
		return templateService.getAllTemplates();
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws ResourceNotFoundException, IOException {
		RiskTemplates files = templateService.getTemplateById(id);
		String fileName=files.getFileName();
		String fileBasePath="C:\\Users\\bmetet\\eclipse-workspace\\rbss\\templates\\";
		Path filePath = Paths.get(fileBasePath + fileName);
		System.out.print(filePath);
		Files.delete(filePath);
		templateService.deleteTemplate(id);
		
	}
	@GetMapping("/entityTemplates/{id}")
	public List<TemplatesPerEntity> getAllTemplates(@PathVariable int id){
		return templateService.getTemplatesById(id);
	}
}
