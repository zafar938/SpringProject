package com.nit.model;

import lombok.Data;

@Data
public class CitizenDetails {
	
  private Integer regId;
  private String  name;
  private String  addrs;
  private Long    aadharNo;
  private Double  price;
  private String  vaccineName;
  private Double  income;
  private String  remarks;
}
