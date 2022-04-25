package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Shop;

public interface IShopservice {
	
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(int id);
	public Shop deleteShop(Shop shop);
	
	public Shop addEmployee(Shop shop);
	public Shop updateEmployee(Shop shop);
	public Shop addItem(Shop shop);     // need to edit?
	

}
