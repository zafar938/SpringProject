package com.nit.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {
	
	private int    sno;
	private String sname;
	private String sadd;
	private float   avg;
	
	
	
	
	public int getSno() {
		return sno;
	}




	public void setSno(int sno) {
		this.sno = sno;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public String getSadd() {
		return sadd;
	}




	public void setSadd(String sadd) {
		this.sadd = sadd;
	}




	public float getAvg() {
		return avg;
	}




	public void setAvg(float avg) {
		this.avg = avg;
	}




	public StudentDTO(int sno, String sname, String sadd, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
	}
	

}
