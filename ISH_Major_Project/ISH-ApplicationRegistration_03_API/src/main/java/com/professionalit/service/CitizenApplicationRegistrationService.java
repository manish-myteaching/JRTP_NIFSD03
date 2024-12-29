package com.professionalit.service;

import com.professionalit.domain.CitizenAppRegistrationRequest;
import com.professionalit.exception.InvalidSSNException;

public interface CitizenApplicationRegistrationService {
	
	public Long registerCitizenApplication(CitizenAppRegistrationRequest citizenAppRegistrationRequest) throws InvalidSSNException ;

}
