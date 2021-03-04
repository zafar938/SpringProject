package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.comps.Vehicle;

public class StategyDPTest1 {
	  public static void main(String[] args) {
		  //create IOC container
		  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nit/cfg/applicationContext.xml"));
			
		  //getTarget class obj
		  Vehicle vehicle=factory.getBean("vehicle",Vehicle.class);
			  //invoke b.method
			  vehicle.journey("dehli","Hyd");
		 
	  }//main

}//class
