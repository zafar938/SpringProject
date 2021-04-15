package com.nit.dao;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nit.model.ActorDetails;


@Repository("actorDAO")
public class ActorDetailsImp implements IActorDetailsDAO {
     
	@Autowired
	 private SimpleJdbcInsert sji;
	
	

		
		  @Override 
		  public int insert(ActorDetails details) {
		  //set Table Name
		  sji.setTableName("ACTOR"); 
		  //exexute query 
		  int count=sji.execute(new
		  BeanPropertySqlParameterSource(details)); return count; 
		  }
		 

}
