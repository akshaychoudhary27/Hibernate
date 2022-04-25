package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.OrderDetails;

public interface IOrderService {
	
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(int id);
	public OrderDetails cancelMall(int id);
	public OrderDetails addItem(OrderDetails order);

}

