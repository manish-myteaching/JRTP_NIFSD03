package com.professionalit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.professionalit.domain.CitizenAppRegistrationRequest;
import com.professionalit.entity.CitizenAppRegisrationEntity;
import com.professionalit.exception.InvalidSSNException;
import com.professionalit.repository.CitizenApplicationRegistrationRepository;
import com.professionalit.util.ValidationUtil;

@Service
public class CitizenApplicationRegistrationServiceImpl implements CitizenApplicationRegistrationService {

	// @Autowired
	// private RestTemplate template;

	@Autowired
	private WebClient webClient;

	@Value("${ar.ssn-web}")
	private String endPointUrl;

	@Value("${ar.state}")
	private String state;
	
	@Autowired
	ValidationUtil validateUtil;

	@Autowired
	private CitizenApplicationRegistrationRepository citizenApplicationRegistrationRepository;

	@Override
	public Long registerCitizenApplication(CitizenAppRegistrationRequest citizenAppRegistrationRequest) {

		//validateUtil.validateCitizen(citizenAppRegistrationRequest);
		// varify citizen is us citizen and claliforia state
		// ResponseEntity<String> response=
		// template.exchange("http://localhost:9090/ssn-web-api/find/{ssn}",HttpMethod.GET,null,String.class,citizenAppRegistrationRequest.getSsn());
		// String stateName=response.getBody();

		String stateName = webClient.get().uri(endPointUrl, citizenAppRegistrationRequest.getSsn()).retrieve()
				.bodyToMono(String.class).block(); // Synchronous call (use sparingly)

		if (state.equals(stateName)) {
			CitizenAppRegisrationEntity citizenAppRegisrationEntity = new CitizenAppRegisrationEntity();
			BeanUtils.copyProperties(citizenAppRegistrationRequest, citizenAppRegisrationEntity);
			citizenAppRegisrationEntity.setCreatedBy("Manish");
			citizenAppRegisrationEntity.setUpdatedBy("Manish");
			CitizenAppRegisrationEntity citizenAppRegisrationResponse = citizenApplicationRegistrationRepository
					.save(citizenAppRegisrationEntity);
			Long appId = citizenAppRegisrationResponse.getApplicationId();
			return appId;
		}
		return 0L;
	}

}
