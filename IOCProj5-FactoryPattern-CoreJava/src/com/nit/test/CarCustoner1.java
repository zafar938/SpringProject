package com.nit.test;

import com.nit.comp.ICar;
import com.nit.factory.CarFactory;

public class CarCustoner1 {
	public static void main(String[] args) {
		 //get Carr
		ICar car=CarFactory.getInstance("sports");
		System.out.println(car.getClass());
		car.drive();
		car.addAccessories();
	}
 }
