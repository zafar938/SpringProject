package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorDetails {
	
	private Integer actorid;
	private String actorName;
	private String actorAddress;
	private Long phone;
	private Double remunration;

}
