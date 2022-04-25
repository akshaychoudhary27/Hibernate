package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Customer;
import com.cg.shoppingmallmanagement.repository.ICustomerRepository;
import com.cg.shoppingmallmanagement.repository.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService {

	ICustomerRepository dao;

	public ICustomerServiceImpl() {
		dao=new ICustomerRepositoryImpl();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer=dao.searchCustomer(id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		dao.beginTransaction();
		dao.deleteCustomer(customer); 
		dao.commitTransaction();
		return null;
	}
	
}
