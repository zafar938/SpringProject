package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.VoteElgibilityChecking;

public class SpringBeanLifeCycleTest {



	public static void main(String[] args) {
      //create IOC container
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//create bean class object
		VoteElgibilityChecking vec=cxt.getBean("voting",VoteElgibilityChecking.class);
		//System.out.println(vec);
		//invoke methods
		 System.out.println(vec.checkElgibility());
		//close stream
		((AbstractApplicationContext) cxt).close();
	}

}
