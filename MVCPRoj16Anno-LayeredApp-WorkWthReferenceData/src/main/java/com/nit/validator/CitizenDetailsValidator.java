package com.nit.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nit.model.CitizenDetails;
@Component
public class CitizenDetailsValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		if(clazz==CitizenDetails.class)
	    	return true;
		else
			return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
	  System.out.println("CitizenDetaialsValidation.validate() :: Server side form validation logic");
	  
     //type casting
	  CitizenDetails detail=(CitizenDetails)target;
	  if(detail.getName()==null||detail.getName().equals("")||detail.getName().length()==0)
		  errors.rejectValue("name", "citizen.name.required");
	  else if(detail.getName().length()<5)
		  errors.rejectValue("name", "citizen.name.minlen");
	  
	  if(detail.getAddrs()==null||detail.getAddrs().equals("")||detail.getAddrs().length()==0)
		  errors.rejectValue("addrs", "citizen.addrs.required");
	  else if(detail.getAddrs().length()<5)
		  errors.rejectValue("addrs", "citizen.addrs.minlen");
	  
	  if(detail.getAadharNo()==null)
		  errors.rejectValue("aadharNo", "citizen.aadhar.required");
	  else if(String.valueOf(detail.getAadharNo()).length()!=12)
		  errors.rejectValue("aadharNo", "citizen.aadhar.length");
	  if(detail.getAge()==null) {
		  errors.rejectValue("age", "citizen.age.required");
	  }
	  
	  
	  if(detail.getVaccineName()==null || detail.getVaccineName().equalsIgnoreCase("") || detail.getVaccineName().length()==0)
			errors.rejectValue("vaccineName","citizen.vaccine.required");
	  
	  
	  if(detail.getIncome()==null)
		  errors.rejectValue("income", "citizen.income.required");
	  
	  else if(detail.getIncome()<1000.0||detail.getIncome()>1000000.0)
		  errors.rejectValue("income", "citizen.income.range");
	}

}
