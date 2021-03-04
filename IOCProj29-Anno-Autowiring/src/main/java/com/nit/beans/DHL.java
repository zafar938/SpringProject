package com.nit.beans;

public class DHL implements Courier {
	
	

	public DHL() {
		System.out.println("DHL O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(DHL)products having " +oid+ " orderid";
	}

}
