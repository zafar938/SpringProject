package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.ILoginMgmtService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		
		//create IOC Conatiner
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/ApplicationContext.xml");
	   //get Service class obj
		ILoginMgmtService service=cxt.getBean("loginService",ILoginMgmtService.class);
		System.out.println(service.login("zafar", "zafar123"));
		
		//close container
		((AbstractApplicationContext) cxt).close();

	}

}
