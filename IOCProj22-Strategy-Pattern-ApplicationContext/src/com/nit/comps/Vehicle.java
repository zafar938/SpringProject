package com.nit.comps;

public class Vehicle {
   private IEngine engg;
   public void setEngg(IEngine engg) {
	   this.engg=engg;
   }
   
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
