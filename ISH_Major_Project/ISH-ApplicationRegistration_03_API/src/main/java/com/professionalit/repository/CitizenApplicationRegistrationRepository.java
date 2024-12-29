package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.professionalit.entity.CitizenAppRegisrationEntity;

@Repository
public interface CitizenApplicationRegistrationRepository  extends  JpaRepository<CitizenAppRegisrationEntity, Long>{

}
