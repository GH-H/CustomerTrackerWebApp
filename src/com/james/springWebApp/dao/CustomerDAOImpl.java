package com.james.springWebApp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.james.springWebApp.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//get current session
		
		Session currentSession = sessionFactory.getCurrentSession();
		//create query
		
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer",Customer.class);
		
				
		//execute query and get result
		List<Customer> customers = theQuery.getResultList();
		//return results
		
		return customers;
	}

}
