package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware{
    private String beanId;
    ApplicationContext cxt;

	
    
	public WebContainer(String beanId) {
		this.beanId = beanId;
		System.out.println("WebContainer.WebContainer(-)");
	}


	@Override
	public void setApplicationContext(ApplicationContext cxt) throws BeansException {
	     System.out.println("WebContainer.setApplicationContext()");
	     this.cxt=cxt;
		
	}


	public void handleRequest(String data) {
		System.out.println("WebContainer :: request came for processing with data ::"+data+"---->"+this.hashCode());
	     //Traditional Dependency Lookup
		RequestHandler rh=cxt.getBean(beanId,RequestHandler.class);
		rh.processingRequest(data);
	   System.out.println("WebContainer :: request  processing completed with data ::"+data);
	}


    
}
