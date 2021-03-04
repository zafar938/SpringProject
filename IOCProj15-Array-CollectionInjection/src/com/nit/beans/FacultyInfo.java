package com.nit.beans;

import java.util.Date;
import java.util.Set;

public class FacultyInfo {
      
	private Set<Long> phoneNumber;
	private Set<Date> impDates;
	
	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setImpDates(Set<Date> impDates) {
		this.impDates = impDates;
	}
	@Override
	public String toString() {
		return "FacultyInfo [phoneNumber=" + phoneNumber + ",\n impDates=" + impDates + "]";
	}
	
	
}
