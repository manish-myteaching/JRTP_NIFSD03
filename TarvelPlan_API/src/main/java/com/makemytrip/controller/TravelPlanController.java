
/**Copyright 2024-2024 the original author or authors.
 * 
 */
package com.makemytrip.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makemytrip.entity.TravelPlan;
import com.makemytrip.exception.TravelPlanIdNotFoundException;
import com.makemytrip.service.TravelPlanService;

/**
 * 
 */
@RestController
@RequestMapping("travelplan/api")
public class TravelPlanController {

	@Autowired
	private TravelPlanService travelPlanService;

	@PostMapping("/register")
	public ResponseEntity<String> addTravelPlan(@RequestBody TravelPlan travelPlan) {
		try {
			String travelResponse = travelPlanService.registerTravelPlan(travelPlan);
			return new ResponseEntity<String>(travelResponse, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get-all-travelplan")
	public ResponseEntity<?> getAllTravelPlan() {
		try {
			List<TravelPlan> listAllTravelPlan = travelPlanService.showAllTravelPlan();
			return new ResponseEntity<List<TravelPlan>>(listAllTravelPlan, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/delete-plan/{planId}")
	public ResponseEntity<String> deleteTravelPlan(@PathVariable Long planId) {
		String deleteMsg = travelPlanService.deleteTravelplan(planId);
		try {
			return new ResponseEntity<String>(deleteMsg, HttpStatus.OK);
		} catch (TravelPlanIdNotFoundException tp) {
			return new ResponseEntity<String>(tp.getMessage(), HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update-plan")
	public ResponseEntity<String> modifyPlan(@RequestBody TravelPlan travelPlan) {
		try {
			String deleteMsg = travelPlanService.updateTravelplan(travelPlan);
			return new ResponseEntity<String>(deleteMsg, HttpStatus.OK);
		} catch (TravelPlanIdNotFoundException tp) {
			return new ResponseEntity<String>(tp.getMessage(), HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get-travelplanbyid/{planId}")
	public ResponseEntity<?> getTavelPlanById(@PathVariable Long planId) {
		try {
			TravelPlan TravelPlan = travelPlanService.showTravelPlanById(planId);
			return new ResponseEntity<TravelPlan>(TravelPlan, HttpStatus.OK);
		} catch (TravelPlanIdNotFoundException tp) {
			return new ResponseEntity<String>(tp.getMessage(), HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get-travelplan-categories")
	public ResponseEntity<?> getTravelPlanCategories() {
		try {
			Map<Long, String> categoriesMap = travelPlanService.getTravelPlanCategories();
			return new ResponseEntity<Map<Long, String>>(categoriesMap, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/status-change/{planId}/{status}")
	public ResponseEntity<String> changeTravelPlanStatus(@PathVariable Long planId, @PathVariable String status) {
		try {
			String msg = travelPlanService.changeTravelPlanStatus(planId, status);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (TravelPlanIdNotFoundException tp) {
			return new ResponseEntity<String>(tp.getMessage(), HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
