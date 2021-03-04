package com.nit.bean;

public class Person {
	private int pid;
	private String pname;
	private long phoneNo;
	private float salary;
	
	
	public Person(int pid, String pname, long phoneNo, float salary) {
		System.out.println("Person :: 4 paramConstructor");
		this.pid = pid;
		this.pname = pname;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", phoneNo=" + phoneNo + ", salary=" + salary + "]";
	}
	
	

}
