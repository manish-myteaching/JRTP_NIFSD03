package com.makemytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makemytrip.entity.TravelPlan;

@Repository
public interface TravelPlanDAO extends JpaRepository<TravelPlan,Long> {
	
	

}
