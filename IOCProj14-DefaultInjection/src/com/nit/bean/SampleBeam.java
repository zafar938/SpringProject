package com.nit.bean;

public class SampleBeam {
	
	private String name;
	private float age;
	
	
	public SampleBeam() {
		
		System.out.println("SampleBeam :: 0-param constructor");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SampleBeam [name=" + name + ", age=" + age + "]";
	}
	
	 

}
