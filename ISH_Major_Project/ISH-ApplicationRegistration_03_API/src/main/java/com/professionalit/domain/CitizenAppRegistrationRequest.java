package com.professionalit.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CitizenAppRegistrationRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String stateName;
	private String gender;
	private String ssn;
	private LocalDate dob;

}
