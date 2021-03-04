package com.nit.factory;

import com.nit.comp.BudgetCar;
import com.nit.comp.ICar;
import com.nit.comp.LuxoryCar;
import com.nit.comp.SportsCar;

public class CarFactory { 
	//factory method-- having factory pattern logic
	public  static ICar getInstance(String type) {
		ICar car=null;
		if(type.equalsIgnoreCase("luxory"))
	         car=new LuxoryCar();
		else if(type.equalsIgnoreCase("budget"))
			car=new BudgetCar();
		else if(type.equalsIgnoreCase("sports"))
			car=new SportsCar();
		else
			throw new IllegalArgumentException("invalid car type");
		
		return car;
		
		
	}

}
