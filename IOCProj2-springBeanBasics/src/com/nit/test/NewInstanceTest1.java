package com.nit.test;

public class NewInstanceTest1 {

	public static void main(String[] args) throws Exception {
		
		//Load the class
		Class c=Class.forName(args[0]);
		//create object
		Object obj=c.newInstance();
		System.out.println("data ::" +obj);

	}

}
