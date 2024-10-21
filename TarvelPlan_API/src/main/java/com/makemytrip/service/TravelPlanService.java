package com.makemytrip.service;

import java.util.List;
import java.util.Map;

import com.makemytrip.entity.TravelPlan;

public interface TravelPlanService {

    //Save Operation	
	public String registerTravelPlan(TravelPlan travelPlan);

	// Select Operation
	public List<TravelPlan> showAllTravelPlan();

	// for single selection
	public TravelPlan showTravelPlanById(Long planId);

	// update Operation
	public String updateTravelplan(TravelPlan travelPlan);

	// Delete Operation
	public String deleteTravelplan(Long planId);

	public Map<Long, String> getTravelPlanCategories();

}
