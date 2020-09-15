package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pack.entity.Customer;

@Service
public interface CustomerService {

	public Optional<Customer> getCustomerById(Integer customerId);
	public List<Customer> getAll();
	
	
}
