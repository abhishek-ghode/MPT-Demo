package com.example.mptdemorv.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.mptdemorv.dao.CustomerDAO;
import com.example.mptdemorv.dto.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		String query = "select customer from Customer customer ";
		return entityManager.createQuery(query).getResultList();
		
	}
	
	@Override
	public Customer add(Customer customer) {
		
		entityManager.persist(customer);
		
		
		return entityManager.find(Customer.class, customer.getId());
	}
	
}
