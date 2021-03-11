package com.zeke.datapp.service;

import java.util.List;

import com.zeke.datapp.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
