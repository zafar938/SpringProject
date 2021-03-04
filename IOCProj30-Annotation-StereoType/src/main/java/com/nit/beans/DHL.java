package com.nit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
@Primary
@Scope("prototype")
public class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(DHL)products having " +oid+ " orderid";
	}

}
