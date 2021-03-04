package com.nit.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrolEng")
public class PetrolEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("PetrolEngine.start() ::====> Petrol Engine started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() ::====> Petrol Engine stopped");
		

	}

}
