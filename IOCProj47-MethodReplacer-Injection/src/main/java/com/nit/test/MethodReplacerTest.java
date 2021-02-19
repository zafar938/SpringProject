package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankLoanIntrestCalculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		//create ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
       //get Bean object
		BankLoanIntrestCalculator calculator=ctx.getBean("blic",BankLoanIntrestCalculator.class);
		System.out.println(calculator.getClass()+"    "+calculator.getClass().getSuperclass());
		//invoke method
		System.out.println("Intrest Amount ::"+calculator.calculatorIntrestAmount(100000,2,12));
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
