package com.nit.comps;

public class PetrolEngine implements IEngine {
	
	

	public PetrolEngine() {
		System.out.println("PetrolEngine  :: 0-param Constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start() ::====> Petrol Engine started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() ::====> Petrol Engine stopped");
		

	}

}
