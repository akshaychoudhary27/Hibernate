package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Mall;

public interface IMalltService {
	
	public Mall addMall(Mall mall);			//c
	public Mall updateMall(Mall mall);		//u
	public Mall searchMall(int id);			//r

}
