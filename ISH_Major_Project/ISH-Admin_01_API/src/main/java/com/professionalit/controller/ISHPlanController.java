package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professionalit.domain.ISHPlan;
import com.professionalit.service.ISHPlanService;

@RestController
@RequestMapping("/admin")
public class ISHPlanController {
	
	@Autowired
	private ISHPlanService ishPlanService;
	
	@PostMapping("/register")
	public ResponseEntity<String> addISHPlan(@RequestBody ISHPlan ishPlan) {
		try {
			
			String ishResponse = ishPlanService.registerISHPlan(ishPlan);
			return new ResponseEntity<String>(ishResponse, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
