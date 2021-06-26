package com.nit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Integer sno;
	private String sname;
	private Float   avg;
	
	
	public Student() {
		System.out.println("Student.Student :: 0 param contructor");
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	public Student(Integer sno, String sname, Float avg) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}
	
	
	
	

}
