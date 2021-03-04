package com.nit.beans;

import java.util.Date;
import java.util.Arrays;
public class College {
	private String favStudent[];
	private Date impDates[];
	
	public void setFavStudent(String[] favStudent) {
		this.favStudent = favStudent;
	}
	public void setImpDates(Date[] impDates) {
		this.impDates = impDates;
	}
	
	@Override
	public String toString() {
		return "College [favStudent=" + Arrays.toString(favStudent) + ",\n impDates=" + Arrays.toString(impDates) + "]";
	}
	
	

}
