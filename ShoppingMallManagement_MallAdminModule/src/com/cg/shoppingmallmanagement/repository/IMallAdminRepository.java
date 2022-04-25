package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.MallAdmin;

public interface IMallAdminRepository {
	
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);		//c
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);	//u
	public MallAdmin deleteMallAdmin(MallAdmin mallAdmin);	//d
	public MallAdmin searchMallAdmin(int id);				//r
	
	public abstract void commitTransaction();
	public abstract void BeginTransaction();
}
