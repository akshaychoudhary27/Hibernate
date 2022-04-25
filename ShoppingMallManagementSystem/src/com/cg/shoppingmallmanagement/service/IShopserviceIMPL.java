package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Shop;
import com.cg.shoppingmallmanagement.repository.IShoprepository;
import com.cg.shoppingmallmanagement.repository.IShoprepositoryIMPL;

public class IShopserviceIMPL implements IShopservice {
	
	IShoprepository dao;

	public IShopserviceIMPL() {
		dao = new IShoprepositoryIMPL();
		
	}

	@Override
	public Shop addShop(Shop shop) {
		dao.BeginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao.BeginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		dao.BeginTransaction();
		Shop shop = dao.searchShopById(id);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop deleteShop(Shop shop) {
		dao.BeginTransaction();
		dao.deleteShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop addEmployee(Shop shop) {
		dao.BeginTransaction();
		dao.addEmployee(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateEmployee(Shop shop) {
		dao.BeginTransaction();
		dao.updateEmployee(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop addItem(Shop shop) {
		dao.BeginTransaction();
		dao.addItem(shop);
		dao.commitTransaction();
		return shop;
	}

	
}
