package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.WishMessageGenerator;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator1=factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2=factory.getBean("wmg",WishMessageGenerator.class);
	   System.out.println(generator.hashCode()+"   "+generator1.hashCode()+"  "+generator2.hashCode());
	   System.out.println("generator==generator1?"+(generator==generator1));
	   System.out.println("generator1==generator2?"+(generator1==generator2));
	}//main

}//class
