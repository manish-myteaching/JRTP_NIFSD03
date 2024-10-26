package com.makemytrip.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JRTP03_PLAN_CATEGORY")
@Data
public class PlanCategory {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;
	@Column
	private String categoryName;

	@Column
	private String activeSW="active";

	@Column(updatable = false, nullable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(nullable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	@Column(updatable = false, nullable = false)
	private String createdBy;
	@Column(nullable = false)
	private String updatedBy;
	
}
