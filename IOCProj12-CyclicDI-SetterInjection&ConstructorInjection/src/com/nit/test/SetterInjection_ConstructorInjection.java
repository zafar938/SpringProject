package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.B;

public class SetterInjection_ConstructorInjection {
	
	public static void main(String[] args) {
		
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//create XmlBeanDefinationReader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//load and read read
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		//create bean obj
		B b=factory.getBean("b1",B.class);
		System.out.println(b);
	}

}
