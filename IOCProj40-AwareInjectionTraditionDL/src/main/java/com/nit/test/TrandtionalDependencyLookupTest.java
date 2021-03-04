package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Cricketer;

public class TrandtionalDependencyLookupTest {

	public static void main(String[] args) {
	  // create IOC container
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		System.out.println("............................");
		//get target Bean class obj
		Cricketer cricketer=cxt.getBean("cricketer",Cricketer.class);
		System.out.println(".............................");
		//invoke the methods
		cricketer.batting();
		System.out.println(".................................");
		cricketer.bowling();
		System.out.println(".................................");
		cricketer.fielding();
		System.out.println(".................................");
		
		((AbstractApplicationContext)cxt).close();

	}

}
