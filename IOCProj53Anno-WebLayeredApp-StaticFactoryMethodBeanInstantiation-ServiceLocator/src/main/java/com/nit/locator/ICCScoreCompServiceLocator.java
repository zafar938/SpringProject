package com.nit.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.nit.external.ICCScoreCompImpl;
import com.nit.external.IICCScoreComp;

@Component("iccLocator")
public class ICCScoreCompServiceLocator  {

	
	public static IICCScoreComp getExternalServiceComp() throws Exception {
		//Actually we should jndi look code getting Extenal Comp ref.. since we take Extenal Comp 
		//normal java class for simplification , So we are going to create object for that class directly
		IICCScoreComp comp=new ICCScoreCompImpl();
		return comp;
	}

	
}
