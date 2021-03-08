package com.nit.editor;

import java.beans.PropertyEditorSupport;

import com.nit.beans.IntrestAmountDetails;

public class IntrestAmountDetailsEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String values[]=text.split(",");
		float pamt=Float.parseFloat(values[0]);
		float rate=Float.parseFloat(values[1]);
		float time=Float.parseFloat(values[2]);
		
		//create IntrestAmountDetails class obj
		IntrestAmountDetails amt=new IntrestAmountDetails();
		amt.setPamt(pamt);amt.setRate(rate);amt.setTime(time);
		
		//set object(amt) as the value to bean property
		setValue(amt);
	}
  
}
