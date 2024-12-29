package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.professionalit.domain.CitizenAppRegistrationRequest;
import com.professionalit.exception.InvalidSSNException;
import com.professionalit.service.CitizenApplicationRegistrationService;

@RestController
public class CitizenApplicationRegistrationController {

	@Autowired
	private CitizenApplicationRegistrationService citizenApplicationRegistrationService;

	@PostMapping("/register-citizen-info")
	public ResponseEntity<String> saveCitizenApplication(
			@RequestBody CitizenAppRegistrationRequest citizenAppRegistrationRequest) {

		Long applicationId = citizenApplicationRegistrationService
				.registerCitizenApplication(citizenAppRegistrationRequest);

		if (applicationId > 0) {
			return new ResponseEntity<String>("Citizen application is  registerd", HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Citizen application is not registerd", HttpStatus.BAD_REQUEST);
	}
}
