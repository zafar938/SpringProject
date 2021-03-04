package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("wm")
public class WishMeassage {

	private WishMeassage() {
		System.out.println("WishMeassage.0-param private constructor");
	}
	 
	public String showWishMsg(String user) {
		return "GOOD MORNING  :: "+user;
	}
	

}
