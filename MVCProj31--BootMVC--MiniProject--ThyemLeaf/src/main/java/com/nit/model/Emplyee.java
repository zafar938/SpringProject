package com.nit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Emplyee implements Serializable{
	@Id
	@GeneratedValue
	private Integer empno;
	private String  ename;
	private String  job;
	private Float    sal;

}
