package com.nit.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	
	@Autowired(required=true)
	@Qualifier("dtdc")
	private Courier courier;
	

	public Flipkart() {
		System.out.println("Flipkart :: 0-param contructor");
	}
      
	 
	  public void setCourier(Courier cr) {
	  System.out.println("Flipkart.setCourier()   ::   "); 
	  this.courier = cr;
	  
	  }
	 
	public String shopping(String items[],float prices[]) {
		
		float billAmt=0.0f;
		for(float p:prices) 
			billAmt=billAmt+p;
		
		//gerate order id;
		int oid=new Random().nextInt(1000000);
		//use courier
		String msg=courier.deliver(oid);
		String finalMsg=Arrays.deepToString(items)+"are shopped having price  "+Arrays.toString(prices)+"with bill Amt ::"+billAmt+"------>"+msg;
		return finalMsg;
		
	}

}  
