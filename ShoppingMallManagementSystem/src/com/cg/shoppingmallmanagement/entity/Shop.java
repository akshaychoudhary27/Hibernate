package com.cg.shoppingmallmanagement.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop implements Serializable {
	
	private static final long serialversionUID=1L;
	
	
	@Id
	private int id;
	private String shopCategory; 
	private String shopName;
	private String customers;
	private String shopStatus;
	private String shopOwner;
	private String leaseStatus;
	private int shopemployee_id;
	
	

	@OneToOne(mappedBy = "shop", cascade = CascadeType.ALL)
	private Mall mall;
	
	@OneToOne(mappedBy = "shop", cascade = CascadeType.ALL)
	private OrderDetails orderdetails;

	
	public int getShopemployee_id() {
		return shopemployee_id;
	}

	public void setShopemployee_id(int shopemployee_id) {
		this.shopemployee_id = shopemployee_id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public OrderDetails getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}

	public static long getSerialversionuid() {
		return serialversionUID;
	}

	
	
}
