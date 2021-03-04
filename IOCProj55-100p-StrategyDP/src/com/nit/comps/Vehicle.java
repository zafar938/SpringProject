package com.nit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
   @Autowired
   @Qualifier("cngEng")
   private IEngine engg;
  
   
   public Vehicle() {
	System.out.println("Vehicle :: O Param Constructor");
}

public void journey(String sourcePlace,String destPlace) {
	   engg.start();
	   System.out.println("Journey started at ::" +sourcePlace);
	   System.out.println("Journey is going on ..............");
	   engg.stop();
	   System.out.println("Journey Ended at ::" +destPlace);
	   
   }
}
