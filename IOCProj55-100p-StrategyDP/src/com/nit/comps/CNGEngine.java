package com.nit.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cngEng")

public class CNGEngine implements IEngine {
     
    
	
	@Override
	public void start() {
		System.out.println("CNGEngine.start() ::====> CNG Engine started");

	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()  ::====> CNG Engine stopped");

	}

}
