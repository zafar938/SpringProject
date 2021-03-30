package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {

	public static void main(String[] args) {
		//create  IOC Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/ApplicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		
		System.out.println("EmpsCount "+service.fetchEmpsCount());
		
		((AbstractApplicationContext) ctx).close();
	}

}
