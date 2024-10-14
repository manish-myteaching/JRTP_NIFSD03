package com.makemytrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makemytrip.entity.TravelPlan;
import com.makemytrip.service.TravelPlanService;

@RestController
@RequestMapping("travelplan/api")
public class TravelPlanController {

	@Autowired
	private TravelPlanService travelPlanService;

	@PostMapping("/register")
	public ResponseEntity<String> addTravelPlan(@RequestBody TravelPlan travelPlan) {

		return null;
	}

	@GetMapping("/get-all-travelplan")
	public ResponseEntity<?> getAllTravelPlan() {
		return null;
	}

	@PostMapping("/delete-plan")
	public String deleteTravelPlan(@PathVariable Long Id) {

		return null;
	}
	
	@GetMapping("/edit-plan")
	public ResponseEntity<TravelPlan> modifyPlan() {
		return null;
	}


}
