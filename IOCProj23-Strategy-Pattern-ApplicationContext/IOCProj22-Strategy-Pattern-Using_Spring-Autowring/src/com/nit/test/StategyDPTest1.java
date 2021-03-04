package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
			
			/*
			 * //getTarget class obj Vehicle vehicle=cxt.getBean("vehicle",Vehicle.class);
			 * //invoke b.method vehicle.journey("dehli","Hyd");
			 */ 
	  }//main

}//class
