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

@Entity
@Table(name = "JRTP03_PLAN_CATEGORY")
public class PlanCategory {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;
	@Column
	private String categoryName;

	@Column
	private char active_sw;

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
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public char getActive_sw() {
		return active_sw;
	}
	public void setActive_sw(char active_sw) {
		this.active_sw = active_sw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	

}
