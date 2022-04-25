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
	
	private int shopId;
	
	private String categories;
	
//	@OneToOne(mappedBy="mall")
//	@JoinColumn(name="malladmin_id")
//	private MallAdmin mallAdmin;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="malladmin_id")
	private MallAdmin mallAdmin;
	
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

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	
	
	

}
