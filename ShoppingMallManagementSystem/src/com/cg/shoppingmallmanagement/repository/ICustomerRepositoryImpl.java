package com.cg.shoppingmallmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmallmanagement.entity.Customer;

public class ICustomerRepositoryImpl implements ICustomerRepository{

	private EntityManager entityManager;

	public ICustomerRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);                           //add
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);                          //update
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer=entityManager.find(Customer.class, id);                      //find
		return customer; 
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		entityManager.remove(customer);                         //delete
		return customer;
	}
	
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}
	
	
}
