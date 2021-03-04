package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//Hold the name and loaction of spring bean file
		FileSystemResource res=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
	//create IOC Container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wishMessageGenerator");
		WishMessageGenerator generator1=(WishMessageGenerator)factory.getBean("wmg");
		WishMessageGenerator generator2=(WishMessageGenerator)factory.getBean("wmg1");
		WishMessageGenerator generator3=(WishMessageGenerator)factory.getBean("msg1");
		WishMessageGenerator generator4=(WishMessageGenerator)factory.getBean("msg2");
		WishMessageGenerator generator5=(WishMessageGenerator)factory.getBean("msg3");
		WishMessageGenerator generator6=(WishMessageGenerator)factory.getBean("msg4");
		
	  System.out.println(generator.hashCode()+"  "+generator1.hashCode()+"  "+generator2.hashCode());
	  System.out.println(generator3.hashCode()+"  "+generator4.hashCode()+"  "+generator5.hashCode()+"  "+generator6.hashCode());
	}//main

}//class
