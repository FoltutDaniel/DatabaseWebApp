package com.zeke.datapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeke.datapp.dao.CustomerDAO;
import com.zeke.datapp.entity.Customer;
import com.zeke.datapp.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the DAO  into controller scans for class that implement CustomerDAO
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get the customer from the dao
		
		List<Customer> theCustomers = customerService.getCustomers();
		//add the customers to the model
		theModel.addAttribute("customers",theCustomers); //customers is name and theCustomers is value
		
		return "list-customer";
	}
	
	@GetMapping("/showFromForAdd")
	public String addCustomer(Model theModel) {
		
		//create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
}
