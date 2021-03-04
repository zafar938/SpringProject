package com.nit.test;

import com.nit.comps.Vehicle;
import com.nit.factory.VehicleFactory;

public class StategyDPTest1 {
	  public static void main(String[] args) {
		  try {
			  //get Vechile object (traget class obj)
			  Vehicle vehicle=VehicleFactory.getInstance("diesel");
			  //invoke b.method
			  vehicle.journey("dehli","Hyd");
		  }
		  catch(IllegalArgumentException iae) {
			 iae.printStackTrace();
		  }
	  }

}
