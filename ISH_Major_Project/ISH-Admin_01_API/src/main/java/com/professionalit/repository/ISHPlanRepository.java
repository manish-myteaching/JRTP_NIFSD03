package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.professionalit.entity.ISHPlanEntity;

@Repository
public interface  ISHPlanRepository extends JpaRepository<ISHPlanEntity, Long>{

}
