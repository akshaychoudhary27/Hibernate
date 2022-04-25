package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.OrderDetails;

public interface IOrderRepository {
	
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(int id);
	public OrderDetails deleteOrder(OrderDetails order);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}

