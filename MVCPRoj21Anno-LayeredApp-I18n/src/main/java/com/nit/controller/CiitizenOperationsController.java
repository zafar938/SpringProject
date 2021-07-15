package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.CitizenDetails;
import com.nit.service.ICitizenMgmtService;

@Controller
public class CiitizenOperationsController {
   @Autowired
   private ICitizenMgmtService service;
   
   @GetMapping("/register")
   public String showHome(@ModelAttribute("citizen") CitizenDetails detail) {
	return "citizen_register";
	   
   }
   @PostMapping("/register")
   public String regiterCitizen(Map<String,Object>map,@ModelAttribute CitizenDetails citizenDetails) {
	   //set data value
	   String result=service.vaccineRegistration(citizenDetails);
	   map.put("resultMsg", result);
	return "show_result";
	   
   }
   
}
