package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.MallAdmin;
import com.cg.shoppingmallmanagement.repository.IMallAdminRepository;
import com.cg.shoppingmallmanagement.repository.IMallAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
	
	IMallAdminRepository dao;

	public IAdminServiceImpl() {
		dao = new IMallAdminRepositoryImpl();
	}

	@Override
	public MallAdmin approveNewShop(MallAdmin mallAdmin) {
		dao.BeginTransaction();
		dao.addMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin updateUser(MallAdmin mallAdmin) {
		dao.BeginTransaction();
		dao.updateMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin login(MallAdmin mallAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallAdmin logOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		dao.BeginTransaction();
		dao.addMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		dao.BeginTransaction();
		dao.updateMallAdmin(mallAdmin);
		dao.commitTransaction();
		return null;
	}

	@Override
	public MallAdmin deleteMallAdmin(MallAdmin mallAdmin) {
		dao.BeginTransaction();
		dao.deleteMallAdmin(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = dao.searchMallAdmin(id);
		return mallAdmin;
	}
	

}
