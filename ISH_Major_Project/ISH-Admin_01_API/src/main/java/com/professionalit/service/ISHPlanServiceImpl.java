package com.professionalit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professionalit.domain.ISHPlan;
import com.professionalit.entity.ISHPlanEntity;
import com.professionalit.repository.ISHPlanRepository;

@Service
public class ISHPlanServiceImpl implements ISHPlanService {

	@Autowired
	private ISHPlanRepository ishPlanRepository;

	@Override
	public String registerISHPlan(ISHPlan ishPaln) {

		ISHPlanEntity ishPlan1 = new ISHPlanEntity();
		//Convert one pojo to another
		BeanUtils.copyProperties(ishPaln, ishPlan1);
		ISHPlanEntity ishPlan = ishPlanRepository.save(ishPlan1);
		return ishPlan.getPlanId() + " Registerd Successfully..!";
	}

	@Override
	public ISHPlanEntity showISHPlanById(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateISHplan(ISHPlanEntity ishPaln) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteISHplan(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, String> getISHPlanCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeISHPlanStatus(Long planId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ISHPlanEntity> showAllISHPlan() {
		// TODO Auto-generated method stub
		return null;
	}

}
