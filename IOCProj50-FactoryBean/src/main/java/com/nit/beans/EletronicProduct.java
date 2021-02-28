package com.nit.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EletronicProduct extends Product {
	
	private String voltage;
	private String  starRating;

}
