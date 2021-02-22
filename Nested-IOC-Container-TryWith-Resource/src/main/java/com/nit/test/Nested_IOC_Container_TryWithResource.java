package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.controller.MainController;

public class Nested_IOC_Container_TryWithResource {

	public static void main(String[] args) {
	      
		//create parent IOC
		ApplicationContext pCxt=new ClassPathXmlApplicationContext("com/nit/cfgs/business-beans.xml");
       //create Child IOC
		ApplicationContext cCxt=new ClassPathXmlApplicationContext(new String[]{"com/nit/cfgs/presentation-beans.xml"},pCxt);
		//call controller class
		MainController controller=cCxt.getBean("controller",MainController.class);
		
		//invoke controller class method
		try {
			controller.getCustomerDetailByBillAmt(30000.0f).forEach(dto->{
				System.out.println(dto);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) cCxt).close();
		((AbstractApplicationContext) pCxt).close();
	}

}
