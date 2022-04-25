package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.Customer;

public interface ICustomerRepository {

		public Customer addCustomer(Customer customer);          //create
		public Customer updateCustomer(Customer customer);      //update
		public Customer searchCustomer(int id);               //retrive
		public Customer deleteCustomer(Customer customer);      //delete

		public abstract void commitTransaction();
		public abstract void beginTransaction();
		

}
