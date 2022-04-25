package com.cg.shoppingmallmanagement.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="malladmin")
public class MallAdmin implements Serializable {
	
	private static final long serialVersionUID=1L;
	
		@Id
		private int id;
		private String name;
		private String password;
		private String phone;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="mall_id")
		private Mall mall;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Mall getMall() {
			return mall;
		}

		public void setMall(Mall mall) {
			this.mall = mall;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
		

}
