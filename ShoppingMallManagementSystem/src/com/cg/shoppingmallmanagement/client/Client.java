package com.cg.shoppingmallmanagement.client;

import com.cg.shoppingmallmanagement.entity.Customer;
import com.cg.shoppingmallmanagement.entity.Mall;
import com.cg.shoppingmallmanagement.entity.MallAdmin;
import com.cg.shoppingmallmanagement.entity.OrderDetails;
import com.cg.shoppingmallmanagement.entity.Shop;
import com.cg.shoppingmallmanagement.service.IAdminService;
import com.cg.shoppingmallmanagement.service.IAdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		MallAdmin mallAdmin = new MallAdmin();
		IAdminService service = new IAdminServiceImpl();
		
		//create operation
		//MallAdmin Class
		mallAdmin.setId(0001);
		mallAdmin.setName("Akshay");
		mallAdmin.setPassword("123");
		mallAdmin.setPhone("1234567890");
		
		//Mall Class
		Mall mall = new Mall();
		mall.setId(01);
		mall.setMallName("orion");
		mall.setLocation("mumbai");
		mall.setCategories("REGIONAL");
		
		//Shop Class
		Shop shop = new Shop();
		shop.setId(1);
		shop.setShopCategory("Regional");
		shop.setShopName("RK");
		shop.setCustomers("All");
		shop.setShopStatus("OPEN ");
		shop.setShopOwner("Jethalal");
		shop.setLeaseStatus("Not For Sale");
		shop.setShopemployee_id(2);
		

		//Customer Class
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Vaishnavi");
		customer.setPhone("1234567890");
		customer.setEmail("xyz@gmail.com");
		
		//OrderDetails Class
		OrderDetails orderdetails = new OrderDetails();
		orderdetails.setId(10);
		orderdetails.setDateOfPurchase("4 April 2022");
		orderdetails.setTotal(2);
		orderdetails.setPaymentMode("Card");
		
		
			//OneToOne Mapping
			//malladmin and mall
			mallAdmin.setMall(mall);
			mall.setMalladmin(mallAdmin);
			
			//mall and shop
			mall.setShop(shop);
			shop.setMall(mall);

			
			//orderDetails and customer and shop
			orderdetails.setCustomer(customer);
			orderdetails.setShop(shop);
			shop.setOrderdetails(orderdetails);
			customer.setOrderdetails(orderdetails);
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
		 * System.out.println("Updation done.");
		 * 
		 * //delete operation mallAdmin = service.searchMallAdmin(0001);
		 * service.deleteMallAdmin(mallAdmin);
		 * System.out.println("Deletion done.");
		 */
	}

}
