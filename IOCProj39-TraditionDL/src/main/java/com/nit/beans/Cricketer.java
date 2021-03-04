package com.nit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
      
	private String name;
	private int jersyNo;
	private String beanId;
	
	
	
	public Cricketer() {
		System.out.println("Cricketer ::  0-param constructor");
	}
	
	public void setName(String name) {
		System.out.println("Cricketer.setName()");
		this.name = name;
	}
	
	public void setJersyNo(int jersyNo) {
		System.out.println("Cricketer.setJersyNo()");
		this.jersyNo = jersyNo;
	}
	
	public void setBeanId(String beanId) {
		System.out.println("Cricketer.setBeanId()");
		this.beanId = beanId;
	}
	
	public void bowling() {
		System.out.println("Mr. "+name+" having jersyNo  "+jersyNo+" is bowling");
	}
	public void fielding() {
		System.out.println("Mr. "+name+" having jersyNo  "+jersyNo+" is fielding");
	}
   public void batting() {
	   System.out.println("Mr. "+name+" having jersyNo "+jersyNo+" is batting");
	   //DependencyLookup to get CricketBat object only in the the batting methods
	   //create  an extra IOC Container
	   ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
     System.out.println("2nd IOC container");
     CricketBat bat=cxt.getBean(beanId,CricketBat.class);
     //use cricketBat obj
     int score=bat.scoreRuns();
     System.out.println("Cricketer run are :: "+score);
   }
	
}
