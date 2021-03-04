package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.Customer;
import com.nit.bean.Marks;
import com.nit.bean.Person;
import com.nit.bean.Student;

public class ConstructorInjectionTest {
	
	
	
	public ConstructorInjectionTest() {
		System.out.println("ConstructorInjectionTest :: 0 param constructor");
	}

	public static void main(String[] args) {
	//create IOC container
	DefaultListableBeanFactory factroy=new DefaultListableBeanFactory();
    //create XmlBeanDefinitaionReader
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factroy);
	//load and read spring bean class
	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
	
	  //get Spring class obj 
	Student st=factroy.getBean("st",Student.class);
	  System.out.println("object data ::" +st);
	 	System.out.println("---------<<<<<<<<<<<<<<<<---------**************************------>>>>>>>>>>>>>>>>>>--------");
	System.out.println();
	System.out.println();
	Student st1=factroy.getBean("st1",Student.class);
	System.out.println("object data ::" +st1);
	System.out.println("---------<<<<<<<<<<<<<<<<---------**************************------>>>>>>>>>>>>>>>>>>--------");
	
	System.out.println();
	System.out.println();
	Student st2=factroy.getBean("st2",Student.class);
	System.out.println("object data ::" +st2);
	System.out.println("---------<<<<<<<<<<<<<<<<---------**************************------>>>>>>>>>>>>>>>>>>--------");
	System.out.println();
	System.out.println();
	
	Marks mm=factroy.getBean("mm",Marks.class);
	System.out.println("object data ::" +mm);
	System.out.println("---------<<<<<<<<<<<<<<<<---------**************************------>>>>>>>>>>>>>>>>>>--------");
	System.out.println();
	System.out.println();
	
	Person pr=factroy.getBean("pr",Person.class);
	System.out.println("object data ::"+pr);
	System.out.println("---------<<<<<<<<<<<<<<<<---------**************************------>>>>>>>>>>>>>>>>>>--------");
	System.out.println();
	System.out.println();
	
	Customer cus=factroy.getBean("cus",Customer.class);
	System.out.println("object Data" +cus);
	System.out.println("*****************************************Thank you********************************************");
	System.out.println();
	System.out.println();
	}
	
	
}
