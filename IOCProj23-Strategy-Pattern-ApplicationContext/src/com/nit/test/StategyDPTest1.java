package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.comps.PetrolEngine;
import com.nit.comps.Vehicle;

public class StategyDPTest1 {
	  public static void main(String[] args) {
		  //create IOC container
		   
			/*
			 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
			 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
			 * reader.loadBeanDefinitions("applicationContext.xml");
			 */
		  ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
			
			
			  //getTarget class obj Vehicle 
		  PetrolEngine p1=cxt.getBean("pEngine",PetrolEngine.class);
		  PetrolEngine p2=cxt.getBean("pEngine",PetrolEngine.class);
		  
		  System.out.println(p1.hashCode()+"   "+p2.hashCode());
		  Vehicle v1=cxt.getBean("vehicle",Vehicle.class);
		  Vehicle v2=cxt.getBean("vehicle",Vehicle.class);
		  System.out.println(v1.hashCode()+"   "+v2.hashCode());
			  //invoke b.method vehicle.journey("dehli","Hyd");
			  
	  }//main

}//class
