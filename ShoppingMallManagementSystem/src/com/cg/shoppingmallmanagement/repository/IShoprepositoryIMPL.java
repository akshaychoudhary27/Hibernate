package com.cg.shoppingmallmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmallmanagement.entity.Shop;

public class IShoprepositoryIMPL implements IShoprepository  {
	
	private EntityManager entityManager;

	public IShoprepositoryIMPL() {
		
		entityManager = JPAUtil.getEntityManager();
		
		  
	}

	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		return shop;
	}

	@Override
	public Shop deleteShop(Shop shop) {
		entityManager.remove(shop);
		return shop;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void BeginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public Shop addEmployee(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateEmployee(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop addItem(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}



	
	}
	
	

	

