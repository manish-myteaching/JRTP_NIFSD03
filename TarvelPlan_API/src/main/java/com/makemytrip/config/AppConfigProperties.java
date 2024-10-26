package com.makemytrip.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("travelplan.api")
@EnableConfigurationProperties
public class AppConfigProperties {
	private Map<String, String> message;

}
