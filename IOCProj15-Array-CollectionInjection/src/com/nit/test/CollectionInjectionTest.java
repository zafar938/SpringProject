package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.College;
import com.nit.beans.CourseInfo;
import com.nit.beans.FacultyInfo;
import com.nit.beans.FruitStore;
import com.nit.beans.Student;

public class CollectionInjectionTest {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		College clg=factory.getBean("clg",College.class);
		System.out.println(clg);
		System.out.println();
		Student st1=factory.getBean("stud",Student.class);
		System.out.println(st1);
		System.out.println();
		FacultyInfo fact=factory.getBean("info",FacultyInfo.class);
		System.out.println(fact);
		System.out.println();
		FruitStore store=factory.getBean("store",FruitStore.class);
		System.out.println(store);
		System.out.println();
		CourseInfo course=factory.getBean("course",CourseInfo.class);
		System.out.println(course);
		System.out.println();
	}

}
