package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
	
	@Autowired
	private Product prod;

	
	
	public void showProductDetials() {
		if(prod!=null)
			System.out.println(prod);
		else
			System.out.println("Product Not recieved");
	}//metthod
	

}
