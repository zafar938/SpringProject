package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.config.BusinessAppConfig;
import com.nit.config.PresentationAppConfig;
import com.nit.controller.MainController;

public class NestedIOCContainerTest {

	public static void main(String[] args) {
		//create parent IOC container
		AnnotationConfigApplicationContext pCxt=new AnnotationConfigApplicationContext(BusinessAppConfig.class);
		//create child IOC container
		AnnotationConfigApplicationContext cCxt=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		cCxt.setParent(pCxt);;
		/*
		 * AnnotationConfigApplicationContext cCxt=new
		 * AnnotationConfigApplicationContext(); cCxt.setParent(pCxt);
		 * cCxt.register(PresentationAppConfig.class); cCxt.refresh();
		 */
		
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
