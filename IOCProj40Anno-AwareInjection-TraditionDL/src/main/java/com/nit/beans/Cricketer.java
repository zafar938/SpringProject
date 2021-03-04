package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("cricketer")
public class Cricketer implements ApplicationContextAware{
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")	
	private int jersyNo;
	@Value("${ckbat.id}")
	private String beanId;
	private ApplicationContext ctx;
	
	
	
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()" +ctx.getClass());
		this.ctx=ctx;
	}

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
	    System.out.println("2nd IOC container");
     CricketBat bat=ctx.getBean(beanId,CricketBat.class);
     //use cricketBat obj
     int score=bat.scoreRuns();
     System.out.println("Cricketer run are :: "+score);
   }

	
}
