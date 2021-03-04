package com.nit.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

public class RealtimeDITest {
	
	public static void main(String[] args) {
		
		//IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//create object of controller class
		BankController controller=ctx.getBean("contrroller",BankController.class);
		
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
		vo.setPAmt(pAmt);vo.setRate(rate);vo.setTime(time);
		
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
