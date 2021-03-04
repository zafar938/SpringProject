package com.nit.comps;

public class DieselEngine implements IEngine {
	
	
	

	public DieselEngine() {
		System.out.println("DieselEngine  :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine.start()  ::====> Diesel Engine started");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop() ::====> Diesel Engine stopped");

	}

}
