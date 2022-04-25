package com.cg.shoppingmallmanagement.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		@Id
		private int id;
		private String name;
		private String phone;
		private String email;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "order_id")
		private OrderDetails orderdetails;

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

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public OrderDetails getOrderdetails() {
			return orderdetails;
		}

		public void setOrderdetails(OrderDetails orderdetails) {
			this.orderdetails = orderdetails;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		

		
}
