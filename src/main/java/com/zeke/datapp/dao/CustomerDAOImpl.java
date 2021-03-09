package com.zeke.datapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.zeke.datapp.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	//inject session factory from the bean with id="sessionFactory"
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {

		//get the current session
		Session session = sessionFactory.getCurrentSession();
		//create query
		Query<Customer> theQuery = session.createQuery("from Customer",	Customer.class);
		//execute query to get result list
		List<Customer> customers = theQuery.getResultList();
		//return list
		return customers;
	}

}
