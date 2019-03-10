package com.example.mptdemorv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mptdemorv.dao.CustomerDAO;
import com.example.mptdemorv.dto.Customer;

@RestController
@RequestMapping("api/v1")
public class CustomerContollerHelper {

	@Autowired
	private CustomerDAO daoRef;
	
	@RequestMapping(value="customer", method=RequestMethod.GET)
	public List<Customer> list(){
		
		return daoRef.findAll();
		
	}
	
	@RequestMapping(value="customer", method=RequestMethod.POST)
	public Customer add(@RequestBody Customer customer){
		Customer customer2 = daoRef.add(customer);
		
		return customer2;
	}
	
	
	
	
	
}
