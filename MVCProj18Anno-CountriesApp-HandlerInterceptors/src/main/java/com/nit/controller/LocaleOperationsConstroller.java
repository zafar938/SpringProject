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
	
	
	
	  @RequestMapping("/list_countries") 
	  public String fetchCountries(Map<String,Object>map) {
	  System.out.println("Modle Attribute Specific object Data :: "+map.getClass()); 
	  List<String> countrieList=service.fetchAllCountries();
	  map.put("countriesInfo",countrieList); map.put("sysDate",
	  LocalDateTime.now()); 
	  return "result";
	  
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
