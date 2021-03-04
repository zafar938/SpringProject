package com.nit.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dieselEng")
@Primary
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("DieselEngine.start()  ::====> Diesel Engine started");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop() ::====> Diesel Engine stopped");

	}

}
