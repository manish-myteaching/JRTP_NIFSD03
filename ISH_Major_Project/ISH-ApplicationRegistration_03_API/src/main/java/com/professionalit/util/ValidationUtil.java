package com.professionalit.util;

import org.springframework.stereotype.Component;

import com.professionalit.domain.CitizenAppRegistrationRequest;
import com.professionalit.exception.InvalidSSNException;

@Component
public class ValidationUtil {

	public void validateCitizen(CitizenAppRegistrationRequest citizenAppRegistrationRequest) throws InvalidSSNException {
		if (citizenAppRegistrationRequest.getSsn().length() != 9) {
			throw new InvalidSSNException("Invalid SSN Number..Please send Valid Number");
		}
	}

}
