package com.nit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
    private String beanId;

	
    
	public WebContainer(String beanId) {
		this.beanId = beanId;
		System.out.println("WebContainer.WebContainer(-)");
	}



	public void handleRequest(String data) {
		System.out.println("WebContainer :: request came for processing with data ::"+data+"---->"+this.hashCode());
	     //Traditional Dependency Lookup
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		RequestHandler rh=cxt.getBean(beanId,RequestHandler.class);
		rh.processingRequest(data);
	   System.out.println("WebContainer :: request  processing completed with data ::"+data);
	}
    
}
