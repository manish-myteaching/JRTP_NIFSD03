package com.professionalit.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JRTP03_PLAN_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ISHPlanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long planId;

	@Column(length = 20, nullable = false)
	private String planName;

	@Column(nullable = false)
	private String planDescription;

	@Column
	private Long planCaegoryID;

	@Column
	private char activeSW = 'a';

	@Column(updatable = false, nullable = false)
	private LocalDate createdDate;
	@Column(nullable = false)
	private LocalDate updateDate;
	@Column(updatable = false, nullable = false)
	private String createdBy;
	@Column(nullable = false)
	private String updatedBy;

}
