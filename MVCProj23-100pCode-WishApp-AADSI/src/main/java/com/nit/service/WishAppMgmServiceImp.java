package com.nit.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishAppMgmServiceImp implements IWishAppMgmService {

	@Override
	public String genrateWishMessage() {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt= LocalDateTime.now();
		
		int hours=ldt.getHour();
		if(hours<12)
			return "GOOD MORNING";
		else if(hours<16)
			return "GOOD AFTERNOON";
		else if(hours<20)
			return "GOOD EVENING";
		else 
		return "GOOD NIGHT";
	}

}
