package com.nit.intializers;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nit.config.RootAppConfig;
import com.nit.config.WebMVCAppConfig;


public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		//paren IOC Container
		AnnotationConfigWebApplicationContext rootCxt=new AnnotationConfigWebApplicationContext();
		rootCxt.register(RootAppConfig.class);
		//create ContextLoader class obj having parent IOC container
		ContextLoaderListener listener=new ContextLoaderListener(rootCxt); 
		sc.addListener(listener);
		
		//crate Child IOC Conatiner
		AnnotationConfigWebApplicationContext childCxt=new AnnotationConfigWebApplicationContext();
		childCxt.register(WebMVCAppConfig.class);
		//create DispatcherServlet Obj
		DispatcherServlet servlet=new DispatcherServlet(childCxt);
		
		//register Listener to ServletContainer
		ServletRegistration.Dynamic dayna=sc.addServlet("dispatcher", servlet);
         dayna.addMapping("/");
         dayna.setLoadOnStartup(2);
	}

	

}
