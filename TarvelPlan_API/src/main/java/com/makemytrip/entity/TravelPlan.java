package com.makemytrip.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JRTP03_TRAVEL_PLAN")
@Data
public class TravelPlan {

	public String getActiveSW() {
		return activeSW;
	}
	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long planId;

	@Column(length = 20, nullable = false)
	private String planName;

	@Column(nullable = false)
	private Double planMinBudget;
	
	@Column
	private Long planCaegoryID;

	@Column
	private String activeSW="active";

	@Column(updatable = false, nullable = false)
	private LocalDate createdDate;
	@Column(nullable = false)
	private LocalDate updateDate;
	@Column(updatable = false, nullable = false)
	private String createdBy;
	@Column(nullable = false)
	private String updatedBy;
	
}
