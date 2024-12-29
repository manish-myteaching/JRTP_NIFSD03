package com.professionalit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate creatTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
	    return builder.build();
	}


}
