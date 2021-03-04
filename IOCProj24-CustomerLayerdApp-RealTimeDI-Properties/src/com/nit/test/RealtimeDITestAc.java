package com.nit.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

public class RealtimeDITestAc {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperties());
		System.out.println();
		System.out.println();
		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		Environment env=((ClassPathXmlApplicationContext)cxt).getEnvironment();
		System.out.println(env.getClass());
		System.out.println(env.getProperty("os.name")+"   "+env.getProperty("jdbc.username"));
		//create object of controller class
		BankController controller=cxt.getBean("controller",BankController.class);
		
		//read input from end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name :: ");
		String name =sc.next();
		System.out.println("Enter Customer Address :: ");
		String add=sc.next();
		System.out.println("Enter Principle Amount");
		String pAmt=sc.next();
		System.out.println("Enter Inrest Rate");
		String rate=sc.next();
		System.out.println("Enter Time in year");
		String time=sc.next();
		
		//create CustomerVO object and set all input to CustomerVO 
		CustomerVO vo=new CustomerVO();
		vo.setCname(name);vo.setCadd(add);
		vo.setpAmt(pAmt);vo.setRate(rate);vo.setTime(time);
		
		//invoke method
		try {
			//use controller class
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}//catch
		
		
	}//main

}//class
