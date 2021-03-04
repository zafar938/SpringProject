package com.nit.beans;

public class DTDC implements Courier {
	
	

	public DTDC() {
		System.out.println("DTDC O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(DTDC)products having"+oid+"orderid";
	}

}
