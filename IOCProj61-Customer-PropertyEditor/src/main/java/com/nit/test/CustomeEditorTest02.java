package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankLoanInterestCalculator;

public class CustomeEditorTest02 {

	public static void main(String[] args) {
		
		
		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
		 * 
		 * @Override public void registerCustomEditors(PropertyEditorRegistry registry)
		 * { registry.registerCustomEditor(IntrestAmountDetails.class, new
		 * IntrestAmountDetailsEditor());
		 * 
		 * } }); XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		 */		 
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		   
		BankLoanInterestCalculator calculator=cxt.getBean("blic",BankLoanInterestCalculator.class);
		
		System.out.println("Interest Amount ::  " +calculator.calculateIntrestAmount());

	}
	

	 
}
