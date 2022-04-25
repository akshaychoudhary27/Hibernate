package com.cg.shoppingmallmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmallmanagement.entity.OrderDetails;

public class IOrderRepositoryImpl implements IOrderRepository{
	
	private EntityManager entityManager;

	public IOrderRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
		
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		 entityManager.persist(order);
			return order;
	
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class , id);
		return order;
	}

	public OrderDetails deleteOrder(OrderDetails order) {
		entityManager.remove(order);
		return order ;
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
	
	


