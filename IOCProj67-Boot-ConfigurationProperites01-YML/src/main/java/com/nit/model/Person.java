package com.nit.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("pb")
@ConfigurationProperties(prefix ="info.per")
public class Person {
    
	 private int id;
	 private String name;
	 
	 private int marks[];
	 private List<String>nickNames;
	 private Set<Long>phoneNumber;
	 
	 
	 private Map<String,Long> idCards;
	 private Properties favFruits;
	 
	 private  Company company;
}
