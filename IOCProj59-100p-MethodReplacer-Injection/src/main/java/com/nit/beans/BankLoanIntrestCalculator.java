package com.nit.beans;

public  class BankLoanIntrestCalculator {
	
	public  float calculatorIntrestAmount(float pAmt,float rate,float time) {
		System.out.println("BankLoanIntrestCalculator::calculatorIntrestAmount(-,-,-) (compound Intrest)");
		//Amount=p(1+(r/n))^nt-p
		
		return (float)(pAmt*Math.pow((1+(rate/100)),time))-pAmt;
		
	}

}
