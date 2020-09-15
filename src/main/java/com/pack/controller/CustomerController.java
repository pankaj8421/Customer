package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Customer;
import com.pack.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomers() {
		List<Customer> listCust=service.getAll();
		return listCust;
	}
	
	@GetMapping( "/{customerId}")
	public Customer getById(@PathVariable Integer customerId) {
		Optional<Customer> op=service.getCustomerById(customerId);
		Customer cust=op.get();
		return cust;
	}
}
