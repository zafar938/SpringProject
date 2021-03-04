///WishMessageGenerator
package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator :: static block");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator-0-param constructor");
	}
	//bean property/attribute
	private Date date;    //after injecction it holds sys date and time

	//setter method for setter injection
	public void setDate(Date date1) {
		System.out.println("WishMessageGenerator.setDate(-)");
		date = date1;
	}
	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()"+date);
		//get hour of the day
		int hour=date.getHours();
		if(hour<12)
		return "GOOD MORNING"+user;
		else if(hour<16)
			return "GOOD AFTERNOON"+user;
		else if(hour<20)
			return "GOOD EVENING"+user;
		else 
			return "GOOD NIGHT"+user;
		
		
	}
	

}
