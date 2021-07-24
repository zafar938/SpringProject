package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TilseController {
	
	@GetMapping("/")
	public String  showHomePage() {
		return "homePageDef";
		
	}
	@GetMapping("/cinema")
	public String  showCinemaPage() {
		return "cinemaPageDef";
		
	}
	@GetMapping("/politics")
	public String  showPoliticsPage() {
		return "politicsPageDef";
		
	}
	@GetMapping("/sports")
	public String  showSportsPage() {
		return "sportsPageDef";
		
	}
	@GetMapping("/about")
	public String  showAboutUsPage() {
		return "about_us";
		
	}
	

}
