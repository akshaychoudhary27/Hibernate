package com.cg.shoppingmallmanagement.client;

import com.cg.shoppingmallmanagement.entity.Mall;
import com.cg.shoppingmallmanagement.entity.MallAdmin;
import com.cg.shoppingmallmanagement.service.IAdminService;
import com.cg.shoppingmallmanagement.service.IAdminServiceImpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MallAdmin mallAdmin = new MallAdmin();
		IAdminService service = new IAdminServiceImpl();
		
		//create operation
		mallAdmin.setId(0001);
		mallAdmin.setName("Shubham");
		mallAdmin.setPassword("shubham");
		mallAdmin.setPhone("1234567890");
		
		Mall mall = new Mall();
		mall.setId(01);
		mall.setMallName("Phoenix");
		mall.setLocation("Pune");
		mall.setShopId(101);
		mall.setCategories("REGIONAL");
		
		//OneToOne Mapping
		mallAdmin.setMall(mall);
		mall.setMallAdmin(mallAdmin);
		
		service.addMallAdmin(mallAdmin);
		
		
		System.out.println("Added Successfully");
		
		/*
		 * //retrive operation mallAdmin = service.searchMallAdmin(0001);
		 * System.out.println(mallAdmin.getId());
		 * System.out.println(mallAdmin.getName());
		 * System.out.println(mallAdmin.getMall());
		 * 
		 * //update operation mallAdmin = service.searchMallAdmin(0001);
		 * mallAdmin.setMall("Inorbit"); service.updateMallAdmin(mallAdmin);
		 * System.out.println("Update is performed");
		 * 
		 * //delete operation mallAdmin = service.searchMallAdmin(0001);
		 * service.deleteMallAdmin(mallAdmin);
		 * System.out.println("Delete is performed");
		 */
	}

}
