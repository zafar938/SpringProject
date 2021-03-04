package com.nit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("flight") 
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
