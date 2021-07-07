package com.nit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.ICitizenDAO;
import com.nit.model.CitizenDetails;

@Service("ctznService")
public class CitizenMgmtService implements ICitizenMgmtService {
	@Autowired
	private  ICitizenDAO dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED,readOnly = false,timeout = 30)
	public String vaccineRegistration(CitizenDetails detail) {
		//write b.logic
		if(detail.getAddrs().equalsIgnoreCase("delhi")) {
			detail.setPrice(0.0);
			detail.setRemarks("In Delhi corona vaccination is free");
		}
		else if(detail.getIncome()<100000) {
			detail.setPrice(0.0);
			detail.setRemarks("For poor people  corona vaccination is free");
		}
		else if(detail.getIncome()<200000) {
			detail.setPrice(250.00);
			detail.setRemarks("For less income people  corona vaccination fee is ::"+detail.getPrice());
		}
		else {
			detail.setPrice(1250.00);
			detail.setRemarks("For normal people  corona vaccination fee is ::"+detail.getPrice());
		}
	     //use DAO
		   int count=dao.insert(detail);
		   return count==0?"Registration for Vaccination is failed":"Registration for Vaccination is completed with the remarks "+detail.getRemarks();
	}

	@Override
	public List<String> fetchVaccineName() {
       //use dao
		List<String> vaccineName=dao.getAllVaccineName();
		return vaccineName;
	}

	@Override
	public Set<String> getAllCountries() {
		Set<String> countriesSet=new TreeSet();
		Locale locales[]=Locale.getAvailableLocales();
		for(Locale locale:locales) {
			countriesSet.add(locale.getDisplayCountry());
			
		}
		return countriesSet;
	}

	@Override
	public Set<String> getAllLanguages() {
	       Set<String> languageSet=new TreeSet();
		Locale locales[]=Locale.getAvailableLocales();
		for(Locale locale:locales) {
			languageSet.add(locale.getDisplayLanguage());
		}
		return languageSet;
	}

	@Override
	public Set<String> getHobbies() {
		Set<String> hobbiesSet=new TreeSet();
		hobbiesSet.add("Sleeping");
		hobbiesSet.add("playingCricket");
		hobbiesSet.add("watchMovie");
		hobbiesSet.add("BookReading");
		hobbiesSet.add("Travelling");
		hobbiesSet.add("talksWith frnd");
		hobbiesSet.add("Sufring");
		
		return hobbiesSet;
	}
	private Map<String,Set<String>> countriesStatesInfo=new HashMap();
	
	public CitizenMgmtService() {
	 Set<String> indiaState=Set.of("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana"
			                       ,"Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur",
			                       "Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana"
			                       ,"Tripura","Uttarakhand","Uttar Pradesh","West Bengal");
	 Set<String> usaState=Set.of("Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii",
			                     "Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan",
			                     "Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico",
			                     "New York","North Carolina","North Dakota","Ohio");
	   countriesStatesInfo.put("India",indiaState);
	   countriesStatesInfo.put("United States", usaState);
	   
	}

	@Override
	public Set<String> getStateOfACountry(String country) {
		
		return countriesStatesInfo.get(country);
	}
	
}
