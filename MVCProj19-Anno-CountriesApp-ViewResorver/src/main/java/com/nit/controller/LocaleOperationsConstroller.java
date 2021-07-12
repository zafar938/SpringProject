package com.nit.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.service.ILocaleMgmtService;

@Controller("controller")

public class LocaleOperationsConstroller {
	@Autowired
	private ILocaleMgmtService service;
	
	@RequestMapping("/welcome")
	public String showHomePage() {
		return "home";
	}
	

@RequestMapping("/about")
public String showAboutPage() {	
	return "about_us";
	
}
@RequestMapping("/contact")
public String showContactPage() {
	return "contact_us";
	
}


}
