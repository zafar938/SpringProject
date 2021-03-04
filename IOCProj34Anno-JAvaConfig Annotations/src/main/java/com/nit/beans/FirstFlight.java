package com.nit.beans;

import javax.inject.Named;

@Named("flight") 
//@Primary
public class FirstFlight implements Courier{

	
	public FirstFlight() {
		System.out.println("FirstFlight -O param constructor ");
	}

	@Override
	public String deliver(int oid) {
	
		return "Deliviring(FirtstFlight)products having " +oid+ " orderid";
	
	}

	
	
}
