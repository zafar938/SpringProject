package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.external.IICCScoreComp;

@Service("cbService")
public class CBScoreMgmtServiceImpl implements ICBScoreMgmtService {
     @Autowired
	IICCScoreComp  extComp;
     
	@Override
	public String findScore(int mid) {
	      //use external Comp
		String score=extComp.getScore(mid);
		return score;
	}

}
