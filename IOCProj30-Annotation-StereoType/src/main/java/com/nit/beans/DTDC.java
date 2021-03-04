package com.nit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
@Scope("prototype")
public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC O-param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "Deliviring(DTDC)products having"+oid+"orderid";
	}

}
