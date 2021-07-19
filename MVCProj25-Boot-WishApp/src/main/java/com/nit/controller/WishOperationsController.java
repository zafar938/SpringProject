package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.service.IWishMessageService;

@Controller
public class WishOperationsController {
	
	@Autowired
	private IWishMessageService service;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("/wish")
	public String generateWishMessage(Map<String,Object>map) {
		String result=service.getWishMessage();
		map.put("resultMsg", result);
		return "show_result";
		
	}

}
