package com.nit.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator {
	
	@Autowired
	private LocalDateTime date;

	public WishMessageGenrator() {
		 System.out.println("WishMessageGenrator::0-param-contructor");
	}
	
	public String genrateWishMessage(String user) {
		System.out.println("WishMessageGenrator :: genrateWishMessage()");
		int hour=0;
		hour=date.getHour();
		if(hour<12)
			return "GOOD MORNINIG"+user;
		else if(hour<16)
			return "GOOD AFTERNOON"+user;
		else if(hour<20)
			return "GOOD EVENING"+user;
		else
		    return "GOOD NIGHT"+user;
		
	}
	

}
