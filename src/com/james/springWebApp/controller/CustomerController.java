package com.james.springWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.james.springWebApp.dao.CustomerDAO;
import com.james.springWebApp.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get customers from dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add customers to model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customers";
	}
}
