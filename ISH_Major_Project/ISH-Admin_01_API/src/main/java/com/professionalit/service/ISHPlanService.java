package com.professionalit.service;

import java.util.List;
import java.util.Map;

import com.professionalit.domain.ISHPlan;
import com.professionalit.entity.ISHPlanEntity;

public interface ISHPlanService {

	// Save Operation
	public String registerISHPlan(ISHPlan ishPaln);

	// Select Operation
	public List<ISHPlanEntity> showAllISHPlan();

	// for single selection
	public ISHPlanEntity showISHPlanById(Long planId);

	// update Operation
	public String updateISHplan(ISHPlanEntity ishPaln);

	// Delete Operation
	public String deleteISHplan(Long planId);

	public Map<Long, String> getISHPlanCategories();

	public String changeISHPlanStatus(Long planId, String status);

}
