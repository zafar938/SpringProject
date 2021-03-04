package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages ="com.nit.beans")
public class AppConfig {
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource createBundle() {
		ResourceBundleMessageSource bundle=new ResourceBundleMessageSource();
		bundle.setBasename("com/nit/commons/App");
		return bundle;
		
	}

}
  