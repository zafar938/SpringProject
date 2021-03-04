package com.nit.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.controller.MRPController;
import com.nit.vo.ProductVO;


public class MrpGenratorTest {

	public static void main(String[] args) {
		
		//create ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		//create contriller class obj
		MRPController mrpgen=ctx.getBean("controller",MRPController.class);
		
		//read input from enduser
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Product Name :: ");
		String pname=scn.next();
		System.out.println("Enter Product Type :: ");
		String type=scn.next();
		System.out.println("Enter Product Quantity :: ");
		String qty=scn.next();
		System.out.println("Enter Product Base Price :: ");
		String baseprice=scn.next();
		
		//create CustomerVO object and set all input to CustomerVO 
				ProductVO vo=new ProductVO();
				vo.setPname(pname);vo.setType(type);
				vo.setQty(qty);vo.setBaseprice(baseprice);
				
				//invoke method
				try {
					//use controller class
					String result=mrpgen.processMrpgenrator(vo);
					System.out.println(result);
				}
				catch(Exception e) {
					System.out.println("Problem in MRP genration ");
					e.printStackTrace();
				}//catch
				

	}

}
