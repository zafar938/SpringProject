package com.nit.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	
	public Integer serialNo;
	private Integer cno;
	private String  cname;
	private String  caddress;
	private Float   billAmt;

}
