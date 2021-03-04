package com.nit.bean;

public class A {
	
	private B b;

	public A() {
		
		System.out.println("A :: 0-paramConstructor");
		
			}

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=  ]";
	}
	
	
	

}
