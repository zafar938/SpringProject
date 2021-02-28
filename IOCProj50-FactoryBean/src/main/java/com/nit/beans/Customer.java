package com.nit.beans;

public class Customer {
	
	private Product prod;

	public Customer(Product prod) {
		System.out.println("Customer.1-param constructor");
		this.prod = prod;
	}//constructor
	
	public void showProductDetials() {
		if(prod!=null)
			System.out.println(prod);
		else
			System.out.println("Product Not recieved");
	}//metthod
	

}
