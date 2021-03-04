package com.nit.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WelcomeGreetings;

public class SpringBasicsTest {

	public static void main(String[] args) {
		
		//LOcate and hold spring bean cfg file
				FileSystemResource res=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		       //create IOC Conatiner(XmlBeanFactory)
				XmlBeanFactory factory=new XmlBeanFactory(res);
				//get Spring bean class object from SpringContainer/IOC container
				Date d=(Date)factory.getBean("dt");
				System.out.println("d obj date ::"+d);
				System.out.println("-------------------------");
				WelcomeGreetings greetings=(WelcomeGreetings)factory.getBean("wg");
				System.out.println("message ::"+greetings.welcome("raja"));

	}  

}
