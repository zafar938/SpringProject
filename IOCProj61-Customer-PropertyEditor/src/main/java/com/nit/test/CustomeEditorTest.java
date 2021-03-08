package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankLoanInterestCalculator;

public class CustomeEditorTest {

	public static void main(String[] args) {
		
		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		 */
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		BankLoanInterestCalculator calculator=cxt.getBean("blic",BankLoanInterestCalculator.class);
		
		System.out.println("Interest Amount ::  " +calculator.calculateIntrestAmount());

	}

}
