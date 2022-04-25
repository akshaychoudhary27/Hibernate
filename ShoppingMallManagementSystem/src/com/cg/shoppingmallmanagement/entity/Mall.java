package com.cg.shoppingmallmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mall")
public class Mall {
	
	@Id
	private int id;
	private String mallName;
	private String location;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shop_id")
	private Shop shop;
	
	private String categories;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "malladmin_id")
	private MallAdmin malladmin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public MallAdmin getMalladmin() {
		return malladmin;
	}

	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}
	
	
	
}
