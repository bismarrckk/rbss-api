package com.bizz.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bizz.controller.dto.RiskUploadsDto;
import com.bizz.controller.dto.RiskUploadsEntityName;
import com.bizz.entity.RiskUploads;
import com.bizz.repository.RiskUploadsRepo;

import exception.ResourceNotFoundException;

@Service
public class RiskUploadsServiceImpl implements RiskUploadsService{
@Autowired
RiskUploadsRepo uploadsRepo;
@Autowired
ModelMapper mapper;
@Autowired
private JavaMailSender javaMailSender;
	@Override
	public List<RiskUploads> getAllUploads() {
		// TODO Auto-generated method stub
		return uploadsRepo.findAll();
	}

	@Override
	public RiskUploads addUploads(RiskUploadsDto uploadsDto) {
		// TODO Auto-generated method stub
		RiskUploads uploads=mapper.map(uploadsDto, RiskUploads.class);
		return uploadsRepo.save(uploads);
	}

	@Override
	public RiskUploads getById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return uploadsRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Risk upload Not found"));
	}

	@Override
	public List<RiskUploadsEntityName> getUploadsEntityName() {
		// TODO Auto-generated method stub
		return uploadsRepo.findRiskUploadsEntities();
	}

	@Override
	public void sendEmail() throws MessagingException, UnsupportedEncodingException {
		 String toAddress = "bmetet@cma.or.ke";
		    String fromAddress = "bmetet@cma.or.ke";
		    String senderName = "RBSS";
		    String subject = "New risk upload";
		    String content = "Hi team,<br>"
		            + "A new risk profile has been uploaded.<br>"
		            
		            + "Regards,<br>"
		            + "RBSS";
		    
		   
		    MimeMessage message = javaMailSender.createMimeMessage();
		    MimeMessageHelper helper = new MimeMessageHelper(message);
		     
		    helper.setFrom(fromAddress, senderName);
		    helper.setTo(toAddress);
		    helper.setSubject(subject);
		     
		     
		    helper.setText(content, true);
		     
		    javaMailSender.send(message);
		
	}


		
	

}
