package com.nit.service;

import java.util.List;
import java.util.Set;

import com.nit.model.CitizenDetails;

public interface ICitizenMgmtService {
	
	public String vaccineRegistration(CitizenDetails detail);
	public List<String> fetchVaccineName();
	public Set<String>  getAllCountries();
	public Set<String>  getAllLanguages();
	public Set<String>  getHobbies();
	public Set<String>  getStateOfACountry(String country);
}
