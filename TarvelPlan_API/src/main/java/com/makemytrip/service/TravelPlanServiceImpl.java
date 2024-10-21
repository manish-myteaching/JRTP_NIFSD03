/**
 *  Copyright 2024 the original author or authors.
 */
package com.makemytrip.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makemytrip.dao.PlanCategoryDAO;
import com.makemytrip.dao.TravelPlanDAO;
import com.makemytrip.entity.PlanCategory;
import com.makemytrip.entity.TravelPlan;

/**
 * @author manish.verma
 */
@Service
public class TravelPlanServiceImpl implements TravelPlanService {

	@Autowired
	private TravelPlanDAO travelPlanDAO;

	@Autowired
	private PlanCategoryDAO planCategoryDAO;

	/*
	 * This method for registering new travel plan
	 */
	@Override
	public String registerTravelPlan(TravelPlan travelPlan) {
		TravelPlan travel = travelPlanDAO.save(travelPlan);
		if (travel != null) {
			// Mail
			return "Travel Plan is registred with id " + travel.getPlanId();
		}
		return "Travel Plan is  not registred";
	}

	/**
	 * This method used for getting all travel plan.
	 */
	@Override
	public List<TravelPlan> showAllTravelPlan() {
		return travelPlanDAO.findAll();
	}

	@Override
	public TravelPlan showTravelPlanById(Long planId) {
		Optional<TravelPlan> travelPlan = travelPlanDAO.findById(planId);
		if (travelPlan.isPresent()) {
			return travelPlan.get();
		} else {
			throw new IllegalArgumentException("planid is not found");
		}
	}

	/*
	 * TO DO
	 */

	@Override
	public String updateTravelplan(TravelPlan travelPlan) {
		Optional<TravelPlan> travelplan = travelPlanDAO.findById(travelPlan.getPlanId());
		if (travelplan.isPresent()) {
			travelPlanDAO.save(travelPlan);
			return travelPlan.getPlanId() + "Travel Plan is updated";
		} else {
			return travelPlan.getPlanId() + " Travel plan is not  found";
		}
	}

	/*
	 * 
	 */
	@Override
	public String deleteTravelplan(Long planId) {
		Optional<TravelPlan> travelplan = travelPlanDAO.findById(planId);
		if (travelplan.isPresent()) {
			travelPlanDAO.deleteById(planId);
			return " Travel plan deleted Scuccessfully  " + planId;
		} else {
			return planId + " Travel plan is not  found";
		}
	}

	/*
	 * 
	 */
	@Override
	public Map<Long, String> getTravelPlanCategories() {
		List<PlanCategory> listCategories = planCategoryDAO.findAll();
		Map<Long, String> categoriesMap = new HashMap<>();		
		listCategories.forEach(category->{
			categoriesMap.put(category.getCategoryId(), category.getCategoryName());
		});
		return categoriesMap;
	}

}
