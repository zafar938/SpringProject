package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.PersonalInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		//get spring bean objs
		PersonalInfo zafarInfo=factory.getBean("zafarInfo",PersonalInfo.class);
		System.out.println(zafarInfo);
		
		  System.out.println("--------------------------"); PersonalInfo
		  rushanInfo=factory.getBean("rushanInfo",PersonalInfo.class);
		  System.out.println(rushanInfo);
		  System.out.println("--------------------------"); PersonalInfo
		  ayanInfo=factory.getBean("ayanInfo",PersonalInfo.class);
		  System.out.println(ayanInfo);
		 
	}//main
}
