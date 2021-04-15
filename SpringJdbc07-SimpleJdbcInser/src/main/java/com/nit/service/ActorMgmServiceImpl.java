package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IActorDetailsDAO;
import com.nit.model.ActorDetails;

@Service("actorService")

public class ActorMgmServiceImpl implements IActorMgmService {
	@Autowired
	private IActorDetailsDAO dao;
	
	@Override
	public String addValue(ActorDetails details) {
	  //use dao
		int count=dao.insert(details);
		 return count==0?"Registration failed":"Registration succeded";
	}

}
