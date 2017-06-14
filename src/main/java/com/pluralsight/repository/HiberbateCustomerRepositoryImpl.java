package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HiberbateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer cust = new Customer();
		cust.setFirstName("RAM");
		cust.setLastName("P");

		customers.add(cust);
		return customers;
	}
}
