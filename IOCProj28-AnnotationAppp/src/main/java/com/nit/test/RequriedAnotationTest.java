package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Robot;

public class RequriedAnotationTest {

	public static void main(String[] args) {
		
		//create IOC container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
        //get Service class obj
		Robot robot=ctx.getBean("robot",Robot.class);
		System.out.println(robot);
	}

}
