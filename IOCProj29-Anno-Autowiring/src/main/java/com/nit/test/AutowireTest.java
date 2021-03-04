package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Flipkart;

public class AutowireTest {

	public static void main(String[] args) {
		
		//create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		//create object
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		String msg=fpkt.shopping(new String[] {"T-shirt","trouser","shoe"},new float[] {1700.0f,5000.0f,3000.0f});
		
         System.out.println(msg);
         
         //close stream
         ((AbstractApplicationContext)ctx).close();
	}

}


