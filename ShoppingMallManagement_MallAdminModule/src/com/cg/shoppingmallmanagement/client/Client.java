package com.cg.shoppingmallmanagement.client;

import com.cg.shoppingmallmanagement.entity.MallAdmin;
import com.cg.shoppingmallmanagement.service.IAdminService;
import com.cg.shoppingmallmanagement.service.IAdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		MallAdmin mallAdmin = new MallAdmin();
		IAdminService service = new IAdminServiceImpl();
		
		//create operation
		mallAdmin.setId(000);
		mallAdmin.setName("suraj");
		mallAdmin.setPassword("suraj");
		mallAdmin.setMall("orion");
		mallAdmin.setPhone(1234567890);
		
		service.addMallAdmin(mallAdmin);
		
		System.out.println("Added Successfully");
		
		
		  //retrive operation mallAdmin = service.searchMallAdmin(0001);
		  System.out.println(mallAdmin.getId());
		  System.out.println(mallAdmin.getName());
		  System.out.println(mallAdmin.getMall());
		 
		  /*
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
