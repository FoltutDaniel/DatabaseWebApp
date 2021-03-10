package com.zeke.datapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeke.datapp.dao.CustomerDAO;
import com.zeke.datapp.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the DAO  into controller scans for class that implement CustomerDAO
	@Autowired
	private CustomerDAO customerDao;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get the customer from the dao
		
		List<Customer> theCustomers = customerDao.getCustomers();
		//add the customers to the model
		theModel.addAttribute("customers",theCustomers); //customers is name and theCustomers is value
		
		return "list-customer";
	}
}
