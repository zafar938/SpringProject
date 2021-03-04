package com.nit.factory;

import com.nit.comps.CNGEngine;
import com.nit.comps.DieselEngine;
import com.nit.comps.IEngine;
import com.nit.comps.PetrolEngine;
import com.nit.comps.Vehicle;

public class VehicleFactory {
    public static Vehicle getInstance(String engineType) {
    	IEngine engg=null;
    	//create dependent class object
    	if(engineType.equalsIgnoreCase("diesel"))
    		engg=new DieselEngine();
    	else if(engineType.equalsIgnoreCase("petrol"))
    		engg=new PetrolEngine();
    	else if(engineType.equalsIgnoreCase("cng"))
    		engg=new CNGEngine();
    	else
    		throw new IllegalArgumentException("invalid engine type");
    	//create Target Class object
    	Vehicle vehicle=new Vehicle();
    	//assign Dependent object to target obj
    	vehicle.setEngg(engg);
		return vehicle;
    	
    }
}
