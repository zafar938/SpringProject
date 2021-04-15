package com.nit.dao;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nit.model.ActorDetails;


@Repository("actorDAO")
public class ActorDetailsImp implements IActorDetailsDAO {
     
	@Autowired
	 private SimpleJdbcInsert sji;
	@Override
	public int insert(ActorDetails details) {
	     sji.setTableName("ACTOR");
	     Map<String, Object> colNameValues=Map.of("ACTORID",details.getActorid(),
	    		                                   "ACTORNAME",details.getActorName(),
	    		                                    "ACTORADDRESS",details.getActorAddress()
	    		                                     ,"PHONE",details.getPhone(),
	    		                                     "REMUNRATION",details.getRemunration());
	     
	     //execute the query
	     int count=sji.execute(colNameValues);
		return count;
	}

}
