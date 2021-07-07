package com.nit.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
   @ModelAttribute("countriesInfo")
   public Set<String> gatherCountries(){
	   System.out.println("CiitizenOperationsController.gatherCountries()");
	   Set<String> countriesSet=service.getAllCountries();
	return countriesSet;
	   
   }
   @ModelAttribute("languageInfo")
   public Set<String> gatherLanguage(){
	   System.out.println("CiitizenOperationsController.gatherLanguage()");
	   Set<String> languageSet=service.getAllLanguages();
	return languageSet;
	   
   }
   @ModelAttribute("hobbiesInfo")
   public Set<String> gatherHobbies(){
	   System.out.println("CiitizenOperationsController.gatherHobbies()");
	   Set<String> hobbiesSet=service.getHobbies();
	return hobbiesSet;
	   
   }
   @PostMapping("/state")
   public String gatherState(@RequestParam("country")String country,@ModelAttribute("citizen")CitizenDetails detail,Map<String,Object>map){
	  System.out.println("CiitizenOperationsController.gatherState()");
	  Set<String> stateSet=service.getStateOfACountry(country);
	  map.put("stateInfo", stateSet);
	   return "citizen_register";
     
   }
 
}
