package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.Shop;

public interface IShoprepository {

	public Shop addShop(Shop shop);//c
	public Shop updateShop(Shop shop);//u
	public Shop searchShopById(int id);//r
	public Shop deleteShop(Shop shop);//d
	
	public Shop addEmployee(Shop shop);
	public Shop updateEmployee(Shop shop);
	public Shop addItem(Shop shop);
	
	public abstract void commitTransaction();
	public abstract void BeginTransaction();
}
