package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("per1")
@ToString
//@PropertySource(value = "com/nit/commons/myfile.properties")
/*
 * @PropertySource(value = {"com/nit/commons/myfile.properties",
 * "com/nit/commons/myfile1.properties"})
 */
/*
 * @PropertySources(value = {@PropertySource(value =
 * "com/nit/commons/myfile.properties"),
 * 
 * @PropertySource(value = "com/nit/commons/myfile1.properties")})
 */
@PropertySource(value = "com/nit/commons/myfile.properties")
@PropertySource(value = "com/nit/commons/myfile1.properties")
public class Person1 {
	
     @Value("${per.id}")
     private int pid;
     @Value("${per.name}")
     private String panme;
     @Value("${per.age}")
     private float age;
     @Value("${os.name}")
     private String os;
     @Value("${Path}")
     private String path;
     
}
