package com.nit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Primary
@Scope("prototype")
public class BlueDart implements Courier {
	
	

	public BlueDart() {
		System.out.println("BlueDart O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(BlueDart)products having " +oid+ " orderid";
	}

}
