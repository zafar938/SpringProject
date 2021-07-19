package com.nit.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String getWishMessage() {
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12)
		  return "Good Moarning"; 
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<20)
			return "Good Evening";
		else 
		return "Good Night";
	}

}
