package com.bankofamerica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@Column(name = "ACCOUNT_ID")
	private Long accountId;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	@Column(name = "IFSC_CODE")
	private String ifscCode;
	
	@Column(name = "AMOUNT")
	private Double amount;

}
