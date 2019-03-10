package com.example.mptdemorv.dao;

import java.util.List;

import com.example.mptdemorv.dto.Customer;

public interface CustomerDAO {

	public List<Customer> findAll();
	
	public Customer add(Customer customer);
	
}
