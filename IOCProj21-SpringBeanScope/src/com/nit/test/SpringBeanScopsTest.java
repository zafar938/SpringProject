package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Printer;
import com.nit.beans.WishMessageGenerator;

public class SpringBeanScopsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader  reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		
		  WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
		  WishMessageGenerator generator1=factory.getBean("wmg1",WishMessageGenerator.class);
		  System.out.println(generator.hashCode()+"   "+generator1.hashCode());
		 
		  Printer p1=factory.getBean("p1",Printer.class);
		  Printer p2=factory.getBean("p1",Printer.class);
		  System.out.println(p1.hashCode()+"   "+p2.hashCode());
		  System.out.println( );
		  Printer p3=factory.getBean("p3",Printer.class);
		  Printer p4=factory.getBean("p3",Printer.class);
		  Printer p5=factory.getBean("p3",Printer.class);
		  System.out.println(p3.hashCode()+"   "+p4.hashCode()+"   "+p5.hashCode());
		  System.out.println("p3==p4  "+(p3==p4));
		  System.out.println("p4==p5  "+(p4==p5));

	}

}
