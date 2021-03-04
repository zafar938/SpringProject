package com.nit.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
        
        Calendar cal=factory.getBean("cal",Calendar.class);
        System.out.println("cal obj class :: "+cal.getClass()+"----->cal obj data :: "+cal.toString());
        System.out.println("-----------------------------");
        Class clazz=factory.getBean("clazz", Class.class);
        System.out.println("clazz obj class :: "+clazz.getClass()+"----->cal obj data :: "+clazz.toString());
        System.out.println("-----------------------------");
        Properties props=factory.getBean("prop",Properties.class);
        System.out.println("props obj class :: "+props.getClass()+"------>props obj data ::"+props.toString());
	    System.out.println("--------------------------------------");
	    String str1=factory.getBean("s1",String.class);
	    System.out.println("s1 obj class :;"+str1.getClass()+"----------->str1 obj data  "+str1.toString());
	    System.out.println("-------------------------------------------------");
	    String str2=factory.getBean("s2",String.class);
	    System.out.println("s1 obj class :;"+str2.getClass()+"----------->str1 obj  data   "+str2.toString());
	    System.out.println("-------------------------------------------------");
	    String  str3=factory.getBean("s2",String.class);
		System.out.println("str3 obj class::"+str3.getClass()+ "---->str1 obj data::"+str3.toString());
		System.out.println("--------------------------------");
		String  str4=factory.getBean("s3",String.class);
		System.out.println("str4 obj class::"+str4.getClass()+ "---->str4 obj data::"+str4.toString());
		
		System.out.println("--------------------------------");
		Iterator it=factory.getBean("it",Iterator.class);
		System.out.println("it obj class::"+it.getClass()+ "---->it obj data::"+it.toString());
	
	}

}
