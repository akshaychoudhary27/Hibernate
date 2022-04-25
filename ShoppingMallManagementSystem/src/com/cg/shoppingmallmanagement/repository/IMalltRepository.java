package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.Mall;

public interface IMalltRepository {
	
		public Mall addMall(Mall mall);			//c
		public Mall updateMall(Mall mall);		//u
		public Mall searchMall(int id);			//r
		
		public abstract void commitTransaction();
		public abstract void BegginTransaction();

}
