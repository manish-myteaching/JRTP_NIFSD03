/**
 *  Copyright 2024 the original author or authors.
 */
package com.makemytrip.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makemytrip.config.AppConfigProperties;
import com.makemytrip.constant.AppliationConstant;
import com.makemytrip.dao.PlanCategoryDAO;
import com.makemytrip.dao.TravelPlanDAO;
import com.makemytrip.entity.PlanCategory;
import com.makemytrip.entity.TravelPlan;
import com.makemytrip.exception.TravelPlanIdNotFoundException;

/**
 * @author manish.verma
 */
@Service
public class TravelPlanServiceImpl implements TravelPlanService {

	@Autowired
	private TravelPlanDAO travelPlanDAO;

	@Autowired
	private PlanCategoryDAO planCategoryDAO;

	private Map<String, String> message;

	public TravelPlanServiceImpl(AppConfigProperties props) {
		message = props.getMessage();
	}

	/*
	 * This method for registering new travel plan
	 */
	@Override
	public String registerTravelPlan(TravelPlan travelPlan) {
		travelPlan.setCreatedDate(LocalDate.now());
		travelPlan.setCreatedBy("Manish"); // By Session
		travelPlan.setUpdateDate(LocalDate.now());
		travelPlan.setUpdatedBy("Shyam"); // By Session
		TravelPlan travel = travelPlanDAO.save(travelPlan);
		if (travel != null) {
			// Mail
			return message.get(AppliationConstant.TRAVEL_PLAN_REGISTER_SUCCESS) + travel.getPlanId();
		}
		return message.get(AppliationConstant.TRAVEL_PLAN_REGISTER_FAIL);
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
			throw new TravelPlanIdNotFoundException(message.get(AppliationConstant.FIND_BY_ID_FAIL));
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
			return travelPlan.getPlanId() + message.get(AppliationConstant.TRAVEL_PLAN_UPDATE);
		} else {
			throw new TravelPlanIdNotFoundException(message.get("find-by-id-fail"));
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

			return message.get("travel-plan-delete-success") + planId;
		} else {
			throw new TravelPlanIdNotFoundException(message.get(AppliationConstant.FIND_BY_ID_FAIL));
		}
	}

	/*
	 * 
	 */
	@Override
	public Map<Long, String> getTravelPlanCategories() {
		List<PlanCategory> listCategories = planCategoryDAO.findAll();
		Map<Long, String> categoriesMap = new HashMap<>();
		listCategories.forEach(category -> {
			categoriesMap.put(category.getCategoryId(), category.getCategoryName());
		});
		return categoriesMap;
	}

	/*
	 * Method for changed travel plan status.
	 */
	@Override
	public String changeTravelPlanStatus(Long planId, String status) {
		Optional<TravelPlan> travelplan = travelPlanDAO.findById(planId);
		if (travelplan.isPresent()) {
			TravelPlan plan = travelplan.get();
			plan.setActiveSW(status);
			travelPlanDAO.save(plan);
			return planId + message.get(AppliationConstant.TRAVEL_PLAN_STATUS_CHANGE);
		} else {
			throw new TravelPlanIdNotFoundException(message.get(AppliationConstant.FIND_BY_ID_FAIL));
		}

	}

}
