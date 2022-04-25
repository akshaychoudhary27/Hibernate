package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.MallAdmin;

public interface IAdminService {
	
	public MallAdmin approveNewShop(MallAdmin mallAdmin);	//c
	public MallAdmin updateUser(MallAdmin mallAdmin);		//u
	public MallAdmin login(MallAdmin mallAdmin);			//r
	public MallAdmin logOut();								
	
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);		//c
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);	//u
	public MallAdmin deleteMallAdmin(MallAdmin mallAdmin);	//d
	public MallAdmin searchMallAdmin(int id);				//r

}
