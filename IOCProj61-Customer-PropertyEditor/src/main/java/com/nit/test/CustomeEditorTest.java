package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.BankLoanInterestCalculator;

public class CustomeEditorTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		BankLoanInterestCalculator calculator=factory.getBean("blic",BankLoanInterestCalculator.class);
		
		System.out.println("Interest ::  " +calculator.calculateIntrestAmount());

	}

}
