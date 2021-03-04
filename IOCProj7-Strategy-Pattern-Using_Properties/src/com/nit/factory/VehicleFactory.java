package com.nit.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nit.comps.IEngine;
import com.nit.comps.Vehicle;

public class VehicleFactory {
	
	private static Properties props;
	
    static {
    	try {
    		//Loard Properties file by using InputStream
    		InputStream is=new FileInputStream("src/com/nit/commons/strategy.properties");
    	   //Load properties info to java.util.Properties class obj
    		props=new Properties();
    		props.load(is);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	public static Vehicle getInstance() {
		Vehicle vehicle=null;
		try {
		//Load and create object of Dependent class by collecting class name from properties file
		String dependentClassName = props.getProperty("dependent.className");
		Class dependentClazz=Class.forName(dependentClassName);
		//IEngine egg=(IEngine)d dependentClazz.getDeclaredConstructor();
		Constructor cons[]=dependentClazz.getDeclaredConstructors();
		IEngine engg=(IEngine)cons[0].newInstance();
		//create object for target class (fixed)
		vehicle=new Vehicle();
		//Assignee Dependent class object to target class object
		vehicle.setEngg(engg);
		
	}//try
	catch(ClassNotFoundException cnf) {
		cnf.printStackTrace();
	}
	catch(Exception cnf) {
		cnf.printStackTrace();
	}
	return vehicle;
	}
}
