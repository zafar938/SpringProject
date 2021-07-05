package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.CitizenDetails;
import com.nit.service.ICitizenMgmtService;
import com.nit.validator.CitizenDetailsValidator;


@Controller
public class CiitizenOperationsController {
   @Autowired
   private ICitizenMgmtService service;
   @Autowired
    private  CitizenDetailsValidator validator;
   
   @GetMapping("/register")
   public String showHome(@ModelAttribute("citizen") CitizenDetails detail) {
	return "citizen_register";
	   
   }
   @PostMapping("/register")
   public String regiterCitizen(Map<String,Object>map,@ModelAttribute("citizen") CitizenDetails citizenDetails,
		                                                BindingResult errors) {
	   System.out.println(citizenDetails.getVflag());
	   if(citizenDetails.getVflag().equalsIgnoreCase("no")) {
	   if(validator.supports(CitizenDetails.class)) {
		   validator.validate(citizenDetails, errors);
		    if(errors.hasErrors())
		    	return "citizen_register";
	   }
	   else
		   return "citizen_register";
	   }
	   
	   if(citizenDetails.getAddrs().equalsIgnoreCase("mumbai")) {
		   errors.rejectValue("addrs", "addrs.location.error");
		   return "citizen_register";
	   }
	   if(citizenDetails.getAge()<18) {
		   errors.rejectValue("age", "citizen.age.error");
		   return "citizen_register";
	   }
	   //set data value
	   String result=service.vaccineRegistration(citizenDetails);
	   map.put("resultMsg", result);
	return "show_result";
	   
   }
   @ModelAttribute("vaccineList")
   public List<String> getVaccineName(){
	   System.out.println("CiitizenOperationsController.getVaccineName()");
	   List<String> vaccineName=service.fetchVaccineName();
	return vaccineName;
	   
   }
}
