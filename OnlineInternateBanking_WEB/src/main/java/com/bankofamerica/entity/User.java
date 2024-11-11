package com.bankofamerica.entity;

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
@Table(name = "USERS")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "SSN_NO")
	private String ssnNo;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USER_PASSWORD")
	private String userPassword;

	@CreationTimestamp
	@Column(name = "CREATED_DATE",updatable = false, nullable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "UPDATED_DATE",nullable = false)
	private LocalDate updateDate;

}
