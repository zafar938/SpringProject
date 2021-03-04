package com.nit.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

@Named("voting")
public class VoteElgibilityChecking  {
    @Value("zafar")
	private String name;
    @Value("23")
	private int age;
	private Date verificationDate;
	
	
	
	public VoteElgibilityChecking() {
		System.out.println("VoteElgibilityChecking :: 0-param constructor");
	}
	public void setName(String name) {
		System.out.println("VoteElgibilityChecking.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteElgibilityChecking.setAge()");
		this.age = age;
	}
	@PostConstruct
	public void myInit() {
		System.out.println("VoteElgibilityChecking.myInit()");
		//initialize those properties which are not partcipating in the injection
		verificationDate=new Date();
		if(name==null|| name.equals("")||age<=0||age>=125)
			throw new IllegalArgumentException("invalid inputs");
		
		
	}
	
	public String checkElgibility() {
		System.out.println("VoteElgibilityChecking.checkElgibility()");
		if(age<18)
		return "Mr./Miss/Mrs. "+name+"("+age+") u r not elgible for Voting . Verified on "+verificationDate;
		else
			return "Mr./Miss/Mrs. "+name+"("+age+") u r  elgible for Voting . Verified on "+verificationDate;
			
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoteElgibilityChecking.myDestroy()");
		//nullify bean properties
		name=null;
		age=0;
		verificationDate=null;	
	}
	
	
}
