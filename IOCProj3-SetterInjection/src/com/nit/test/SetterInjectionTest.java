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
		WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wmg");
	  //System.out.println("result :: "+generator.generateWishMessage("  raja"));
	}//main

}//class
