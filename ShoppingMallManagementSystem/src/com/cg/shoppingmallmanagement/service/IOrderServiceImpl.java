package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.OrderDetails;
import com.cg.shoppingmallmanagement.repository.IOrderRepository;
import com.cg.shoppingmallmanagement.repository.IOrderRepositoryImpl;

public class IOrderServiceImpl implements IOrderService {
	IOrderRepository dao;

	public IOrderServiceImpl() {
dao= new IOrderRepositoryImpl (); 
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
	dao.beginTransaction();
	dao.updateOrder(order);
	dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order=dao.searchOrder(id);
		return order;
	}



	@Override
	public OrderDetails addItem(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails cancelMall(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
