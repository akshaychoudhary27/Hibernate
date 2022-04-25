package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Mall;
import com.cg.shoppingmallmanagement.repository.IMalltRepository;
import com.cg.shoppingmallmanagement.repository.IMalltRepositoryImpl;

public class IMalltServiceImpl implements IMalltService {
	
	IMalltRepository dao;

	public IMalltServiceImpl() {
		dao = new IMalltRepositoryImpl();
	}

	@Override
	public Mall addMall(Mall mall) {
		dao.BegginTransaction();
		dao.addMall(mall);
		dao.commitTransaction();
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		dao.BegginTransaction();
		dao.updateMall(mall);
		dao.commitTransaction();
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = dao.searchMall(id);
		return mall;
	}
	
	
	
	

}
