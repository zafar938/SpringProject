package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.service.IWishAppMgmService;

@Controller
public class WishMessagesRenderingController {
   
	 @Autowired
	private IWishAppMgmService service;
	
	@RequestMapping({"/","/welcome"})
	public String showHomePage() {
		return "home";
		
	}
	@RequestMapping("/wish")
	public String showWishMessage(Map<String,Object>map) {
		String result=service.genrateWishMessage();
		map.put("wishMessage", result);
		return "show_result";
		
	}
}
