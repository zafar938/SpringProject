package com.nit.dao;

import java.util.List;

import com.nit.model.CitizenDetails;

public interface ICitizenDAO {
	
	public int insert(CitizenDetails detail);
	public List<String> getAllVaccineName();
	
}
