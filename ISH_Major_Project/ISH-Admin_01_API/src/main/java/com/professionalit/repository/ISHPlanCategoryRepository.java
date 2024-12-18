package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.professionalit.entity.ISHPlanCategoryEnitity;

@Repository
public interface ISHPlanCategoryRepository  extends JpaRepository<ISHPlanCategoryEnitity, Long> {

}
