package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.external.IICCScoreComp;
import com.nit.locator.ICCScoreCompServiceLocator;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	@Autowired
	private ICCScoreCompServiceLocator locator;
	
	@Bean(name="extComp")
	public IICCScoreComp createExternalComp() {
		
			return ICCScoreCompServiceLocator.getExternalServiceComp();
		
		
	}

}
