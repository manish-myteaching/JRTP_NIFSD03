package com.professionalit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "JRTP03_CITIZEN_APPLICATION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitizenAppRegisrationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long applicationId;

	@Column(length = 30)
	private String firstName;
	@Column(length = 30)
	private String lastName;
	@Column(length = 1)
	private String gender;

	@Column
	private LocalDate dob;

	@Column
	private String email;
	@Column
	private String phoneNo;
	@Column
	private String ssn;
	@Column(updatable = false, nullable = false)
	private String stateName;

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
