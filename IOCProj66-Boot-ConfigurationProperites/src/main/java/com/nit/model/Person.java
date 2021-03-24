package com.nit.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("pb")
@ConfigurationProperties(prefix="info.per")
public class Person {
	/*
	 * @Value("${info.per.id}") private int id;
	 * 
	 * @Value("${info.per.name}") private String name;
	 */
	//@Value(value="")
	private int id;
	private String name;
	
	//Array/List/Set perperties
	private int marks[];
	private List<String>nickNames;
	private Set<Long>phoneNumber;
	
	//Map properties
	private Map<String,String>idCard;
	private Properties favFruits;
	
	//HAS-A property
	private Address addrs;
	
}
