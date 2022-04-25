package com.cg.shoppingmallmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmallmanagement.entity.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository{
	
	private EntityManager entityManager;

	public IMallAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
		
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin deleteMallAdmin(MallAdmin mallAdmin) {
		entityManager.remove(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		return mallAdmin;
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void BeginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	
	

}
