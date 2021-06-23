package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
   
	@RequestMapping(value= {"/abc","/abcd","/xyz"})
	public String showAboutPage() {	
		return "about_us";
		
	}
	@RequestMapping(value= {"/abc","/abcd","/xyz"},method={RequestMethod.GET,RequestMethod.POST})
	  public String showAboutUsPage() {
	  System.out.println("LocaleOperationsConstroller.showAboutUsPage1()");
	  //return LVN 
	  return "about_us1";
}
}
