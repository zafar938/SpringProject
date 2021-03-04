//printer.java (Singleton java class with minumun standards
package com.nit.singleton;

public class Printer {
	private static Printer INSTANCE;
	//private Constructor
	private Printer() {
		System.out.println("Printer :: 0-param constructor");
	}//constructor
	
	//public static factory method having  singleton logic
	public static Printer getInstance() {
		
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}//method
	
     //b.method
	public void printData(String msg) {
		System.out.println(msg);
	}
	
}
