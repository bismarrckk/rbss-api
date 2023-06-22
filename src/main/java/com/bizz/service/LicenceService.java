package com.bizz.service;

import java.util.List;

import com.bizz.controller.dto.LicencesDto;
import com.bizz.entity.Licences;

import exception.ResourceNotFoundException;

public interface LicenceService {
	Licences addLicence(LicencesDto licenceDto) throws ResourceNotFoundException;
	Licences updateLicence(LicencesDto licenceDto, int id) throws ResourceNotFoundException;
	List<Licences> getAllLicences();
	void deleteLicence(int id) throws ResourceNotFoundException;

}
