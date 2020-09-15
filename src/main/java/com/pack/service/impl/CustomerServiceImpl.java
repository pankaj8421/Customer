package com.pack.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.Customer;
import com.pack.repository.CustomerRepository;
import com.pack.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;

	@Override
	public Optional<Customer> getCustomerById(Integer customerId) {

		Optional<Customer>op=repo.findById(customerId);
		Customer cust=op.get();
		Integer custId=cust.getCustomerId();
		System.out.println(custId);
		//hii hello
		System.out.println("hii buddy");
		return op;
	}

	@Override
	public List<Customer> getAll() {
		
		return repo.findAll();
	}

}
