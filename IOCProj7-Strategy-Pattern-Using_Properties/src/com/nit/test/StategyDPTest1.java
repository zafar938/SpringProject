package com.nit.test;

import com.nit.comps.Vehicle;
import com.nit.factory.VehicleFactory;

public class StategyDPTest1 {
	  public static void main(String[] args) {
		  
			  //get Vechile object (traget class obj)
			  Vehicle vehicle=VehicleFactory.getInstance();
			  //invoke b.method
			  vehicle.journey("dehli","Hyd");
		 
	  }

}
