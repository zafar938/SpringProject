package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Customer;

public class FactoryBeanTest {

	public static void main(String[] args) {
		//create IOC Container
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get bean class object
		Customer cust=cxt.getBean("cust",Customer.class);
		System.out.println("......................................");
		System.out.println();
		//show details
		cust.showProductDetials();
		System.out.println();
		System.out.println("......................................");
		//close container
		((AbstractApplicationContext) cxt).close();

	}

}
