package com.nit.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.SampleBeam;

public class SampleTest {
	
	public static void main(String[] args) {
		
		//create ioc contaner
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//create Xml DefinitionReader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//read and load file
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		//create SampleBeam class object
		SampleBeam bean1=factory.getBean("com.nit.bean.SampleBeam#0",SampleBeam.class);
		System.out.println(bean1);
		System.out.println();
		SampleBeam bean2=factory.getBean("com.nit.bean.SampleBeam",SampleBeam.class);
		System.out.println(bean2);
		System.out.println();
		SampleBeam bean3=factory.getBean("com.nit.bean.SampleBeam#1",SampleBeam.class);
		System.out.println(bean3);
		System.out.println();
		SampleBeam bean4=factory.getBean("com.nit.bean.SampleBeam#2",SampleBeam.class);
		System.out.println(bean4);
		System.out.println();
		Date date=factory.getBean("java.util.Date",Date.class);
		System.out.println(date);
		System.out.println();
		Date date1=factory.getBean("java.util.Date#1",Date.class);
		System.out.println(date1);
		
	}

}
