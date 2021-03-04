package com.nit.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public interface WebContainer {
    
     @Lookup
	public abstract RequestHandler getHandler();

	default void handleRequest(String data) {
		System.out.println("WebContainer :: request came for processing with data ::"+data+"---->"+this.hashCode());
	     //Traditional Dependency Lookup
		RequestHandler rh=getHandler();
		rh.processingRequest(data);
	   System.out.println("WebContainer :: request  processing completed with data ::"+data);
	}


    
}
