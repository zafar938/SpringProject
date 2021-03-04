package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.comps.Vehicle;
import com.nit.config.AppConfig;

public class StategyDPTest1 {
	  public static <AnnotaionConfigApplication> void main(String[] args) {
		  //create IOC container
		  //BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nit/cfg/applicationContext.xml"));
			AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		  //getTarget class obj
		  Vehicle vehicle=cxt.getBean("vehicle",Vehicle.class);
			  //invoke b.method
			  vehicle.journey("dehli","Hyd");
			  
			  //close
			  ((AbstractApplicationContext) cxt).close();
		 
	  }//main

}//class
