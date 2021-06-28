package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Student {
	
	private Integer sno;
	private String sname;
	private Float avg=11.11f;
	
	
	
	

}
