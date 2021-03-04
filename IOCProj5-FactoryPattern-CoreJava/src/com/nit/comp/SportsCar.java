package com.nit.comp;

public class SportsCar implements ICar {

	@Override
	public void drive() {
		System.out.println(" Driving SportsCar .....");

	}

	@Override
	public void addAccessories() {
		System.out.println("Fitting Accessories to Sport Car ....");
	}

}
