package com.nit.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.BankLoanInterestCalculator;
import com.nit.beans.IntrestAmountDetails;
import com.nit.editor.IntrestAmountDetailsEditor;

public class CustomeEditorTest {

	public static void main(String[] args) {
		
		
		  DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		  factory.addPropertyEditorRegistrar(new MyPERegistrar());
		  XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		 
		//ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		   
		BankLoanInterestCalculator calculator=factory.getBean("blic",BankLoanInterestCalculator.class);
		
		System.out.println("Interest Amount ::  " +calculator.calculateIntrestAmount());

	}
	
	//static inner class/Nasted class
	private static class MyPERegistrar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(IntrestAmountDetails.class, new IntrestAmountDetailsEditor());
		}//registerCustomEditor
	}//inner class

}
