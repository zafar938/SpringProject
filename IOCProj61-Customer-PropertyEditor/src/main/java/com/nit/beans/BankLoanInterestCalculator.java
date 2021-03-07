package com.nit.beans;

public class BankLoanInterestCalculator {
	private IntrestAmountDetails details;

	
    
	public void setDetails(IntrestAmountDetails details) {
		this.details = details;
	}



	public float calculateIntrestAmount() {	
		return (details.getPamt()*details.getPamt()*details.getTime())/100.0f;
		
	}
	
	
	

}
