package com.makemytrip.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makemytrip.dao.TravelPlanDAO;
import com.makemytrip.entity.TravelPlan;

@Service
public class TravelPlanServiceImpl implements TravelPlanService {

	@Autowired
	TravelPlanDAO travelPlanDAO;

	@Override
	public String registerTravelPlan(TravelPlan travelPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelPlan> showAllTravelPlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TravelPlan showTravelPlanById(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTravelplan(TravelPlan travelPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTravelplan(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getTravelPlanCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
