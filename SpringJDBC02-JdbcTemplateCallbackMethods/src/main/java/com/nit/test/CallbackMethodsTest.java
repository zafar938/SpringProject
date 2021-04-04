package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.service.IEmployeeMgmtService;

public class CallbackMethodsTest {

	public static void main(String[] args) {
		//create ioc container
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		//get Service class obj
		IEmployeeMgmtService service=cxt.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		try {
			System.out.println("7499 Emp details are :: "+service.fetchEmployeeByNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) cxt).close();

	}

}
