package com.james.springWebApp.dao;

import java.util.List;

import com.james.springWebApp.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
}
