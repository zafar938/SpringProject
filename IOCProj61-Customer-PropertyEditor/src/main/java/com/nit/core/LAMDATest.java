package com.nit.core;

public class LAMDATest {

	public static void main(String[] args) {
		
		Test t1=()->{return 100;};
		System.out.println(t1.m1());
		System.out.println("--------------------------------------");
		
		
		  Test t2=()-> 100;
		  System.out.println(t2.m1());
		 
		
	System.out.println("=========================================");
     
	Test1 o1=(x->{
    	 System.out.println(x);
     });
     o1.m1(450);
     System.out.println("-----------------------------------------");
	  Test1 o2=(x->
	    System.out.println(x)
	  );
	  o2.m1(450);
	  System.out.println("----------------------------------------");
	Test1 o3=x->System.out.println(x);	  
	o3.m1(450);
	System.out.println("--------------------------------------------");
	Test1 o4=System.out::println;
	o4.m1(500);
	}

}
