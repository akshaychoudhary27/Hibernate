package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);         
	public Customer updateCustomer(Customer customer);    
	public Customer searchCustomer(int	 id);              
	public Customer deleteCustomer(Customer customer);
}
