package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

@Data
public class Customer {

	@Id
	private Integer customerId;
	private String customerName;
	private Long customerNo;
	private Long orderId;
	
	
	
}
