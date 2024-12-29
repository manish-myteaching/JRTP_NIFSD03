package com.bankofamerica.entity;

import java.time.LocalDateTime;

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
public class Userinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
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
	@Column(name = "CREATED_DATE", updatable = false, nullable = false)
	private LocalDateTime  createdDate;

	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", nullable = false)
	private LocalDateTime  updateDate;
	
	
	
}
