package com.nit.comp;

public class Test {
    private int a,b;
    static {
    	System.out.println("Test:Static block ");
    }
    public Test() {
    	System.out.println("Test::0-param constructor)");
    }
    public Test(int a,int b) {
    	System.out.println("Test::2-param constructor)");
    	this.a=a;
    	this.b=b;
    }
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
    
}
