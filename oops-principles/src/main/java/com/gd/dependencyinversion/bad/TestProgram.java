package com.gd.dependencyinversion.bad;

import java.util.ArrayList;
import java.util.List;

public class TestProgram {

	public static void main(String[] args) throws Exception {

		CustomerDao customerDao = new CustomerDaoImpl();
		performOperationsUsing(customerDao);
	}

	private static void addCustomers(CustomerDao customerDao) throws Exception {
		for (Customer customer : generateSampleCustomers()) {
			customerDao.add(customer);
		}
	}

	private static void performOperationsUsing(final CustomerDao customerDao) throws Exception {
		addCustomers(customerDao);
		final Customer customer = new Customer(29, "G", "Das");
		customerDao.add(customer);
		customer.setFirstName("Gouranga");
		customerDao.update(customer);
	}

	/**
	 * Generate customers.
	 * 
	 * @return list of customers.
	 */
	public static List<Customer> generateSampleCustomers() {
		final Customer customer1 = new Customer(1, "Adam", "Adamson");
		final Customer customer2 = new Customer(2, "Bob", "Bobson");
		final Customer customer3 = new Customer(3, "Carl", "Carlson");
		final List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		return customers;
	}
}
