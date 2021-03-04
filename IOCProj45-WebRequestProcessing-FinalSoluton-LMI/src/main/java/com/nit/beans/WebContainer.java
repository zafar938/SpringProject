package com.nit.beans;

public abstract class WebContainer {
    

	public WebContainer() {
		System.out.println("WebContainer.0-param constructor()"+this.getClass());
			}
	public abstract RequestHandler getHandler();

	public void handleRequest(String data) {
		System.out.println("WebContainer :: request came for processing with data ::"+data+"---->"+this.hashCode());
	     //Traditional Dependency Lookup
		RequestHandler rh=getHandler();
		rh.processingRequest(data);
	   System.out.println("WebContainer :: request  processing completed with data ::"+data);
	}


    
}
