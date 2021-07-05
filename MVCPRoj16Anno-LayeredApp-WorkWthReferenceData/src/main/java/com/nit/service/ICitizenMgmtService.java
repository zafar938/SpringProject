package com.nit.service;

import java.util.List;

import com.nit.model.CitizenDetails;

public interface ICitizenMgmtService {
	
	public String vaccineRegistration(CitizenDetails detail);
	public List<String> fetchVaccineName();

}
