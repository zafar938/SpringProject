package com.nit.test;

import java.lang.reflect.Constructor;

import com.nit.beans.Printer;

public class AccessingPrivateConstructorTest {
	
	public static void main(String[] args) {
		try {
			//load class
		Class c=Class.forName("com.nit.beans.Printer");
		//get access to constructor
		 Constructor cons[]=c.getDeclaredConstructors();
		//get access to private constructor
		cons[0].setAccessible(true);
		//create  object for load class
		Printer p1=(Printer) cons[0].newInstance();
		Printer p2=(Printer) cons[0].newInstance();
		System.out.println(p1.hashCode()+"    "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
	}//main

}//class
