package com.nit.beans;

public class BlueDart implements Courier {
	
	

	public BlueDart() {
		System.out.println("BlueDart O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(BlueDart)products having " +oid+ " orderid";
	}

}
