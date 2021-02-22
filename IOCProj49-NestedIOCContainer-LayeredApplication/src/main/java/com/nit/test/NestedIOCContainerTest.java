package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.controller.MainController;

public class NestedIOCContainerTest {

	public static void main(String[] args) {
		//create parent IOC container
		ApplicationContext pCxt=new ClassPathXmlApplicationContext("com/nit/cfgs/business-beans.xml");
		//create child IOC container
		ApplicationContext cCxt=new ClassPathXmlApplicationContext(new String[]{"com/nit/cfgs/presentation-beans.xml"},pCxt);
		
		//get Controller class
		MainController controller=cCxt.getBean("controller",MainController.class);
		//invoke Method
		try {
			controller.showEmpsByDesgs("CLERK", "MANAGER","SALESMAN").forEach(dto->{
				
				System.out.println(dto);
			});

	}//try
    catch(Exception e) {
    	e.printStackTrace();
    }
	//close container
		((AbstractApplicationContext) cCxt).close();
		((AbstractApplicationContext) pCxt).close();

  }
}
