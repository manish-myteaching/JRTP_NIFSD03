package com.makemytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makemytrip.entity.PlanCategory;

@Repository
public interface PlanCategoryDAO  extends JpaRepository<PlanCategory,Long>  {

}
