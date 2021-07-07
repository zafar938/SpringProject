package com.nit.model;

import lombok.Data;

@Data
public class CitizenDetails {
	
  private Integer regId;
  private String  name;
  private String  addrs;
  private Long    aadharNo;
  private Integer age;
  private Double  price;
  private String  vaccineName; 
  private Double  income;
  private String  remarks;
  private  String vflag="no";
  private String  country="India";
  private String  state;
  private String  language[]=new String[] {"Hindi","English"};
  private String  hobbies[]=new String[] {"watchMovie","Sleeping"};
}
