package com.nit.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductDTO implements Serializable {
	
	private String pname;
	private String type;
	private float qty;
	private float baseprice;


}
