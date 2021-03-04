package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.A;

public class ConstructorInjection {
	  public static void main(String[] arga) {
	//create IOC Container
			DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
			//create XmlDefibitionReader
			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
			//load and read spring bin cfg file
			reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
			//get bean obj
			A a=factory.getBean("a1" ,A.class);
			System.out.println(a);
		}
}
