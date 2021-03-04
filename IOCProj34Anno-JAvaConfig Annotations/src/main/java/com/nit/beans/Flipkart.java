package com.nit.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("fpkt")

public class Flipkart {
	
  //@Inject
  //@Named("activeCourier")
  @Resource(name="activeCourier")
	private Courier courier;
	
	//@Inject
	//@Named("activeCourier")
	//@Resource(name="activeCourier")
	public Flipkart(Courier courier) {
	
	this.courier = courier;
}

	//@Inject
	 // @Named("activeCourier")
	public Flipkart() {
		System.out.println("Flipkart :: 0-param contructor");
	}
      
	 // @Inject
	 // @Named("activeCourier")
	//@Resource(name="activeCourier")
	  public void insert(Courier cr) {
	  System.out.println("Flipkart.setCourier()   ::   "); 
	  this.courier = cr;
	  
	  }
	  //@Inject
	  // @Named("activeCourier")
	  //@Resource(name="activeCourier")
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
