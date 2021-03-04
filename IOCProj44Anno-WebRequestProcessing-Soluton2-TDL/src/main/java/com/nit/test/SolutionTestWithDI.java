package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WebContainer;

public class SolutionTestWithDI {

	public static void main(String[] args) {
		//IOC Conatiner
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
         System.out.println(".....................................");
         //get Target Spring bean class obj
         WebContainer container=cxt.getBean("container",WebContainer.class);
         
         //invoke methods
         container.handleRequest("hi");
         System.out.println("..............................");
         container.handleRequest("hello");
         System.out.println("..............................");
         container.handleRequest("take care");
         ((AbstractApplicationContext) cxt).close();
	}

}
