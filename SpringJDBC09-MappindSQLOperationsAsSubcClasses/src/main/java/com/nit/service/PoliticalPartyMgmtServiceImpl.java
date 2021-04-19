package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IPoliticalPartyDAO;
import com.nit.model.PoliticalParty;

@Service("partyService")
public class PoliticalPartyMgmtServiceImpl implements IPoliticalPartyMgmtService {
  
	@Autowired
	private IPoliticalPartyDAO dao;
	@Override
	public PoliticalParty fetchPoliticalPartyDetailsByPartyId(int partyId) {
		//use dai
		PoliticalParty party=dao.getPoliticalPartyDetailsByPartyId(partyId);
		return party;
	}
	@Override
	public List<PoliticalParty> fetchPoliticalPartyDetailsByPartyName(String partyName1, String partyName2,String partyName3) {
		List<PoliticalParty> list=dao.getPoliticalPartiesByPartyNames(partyName1, partyName2, partyName3);
		return list;
	}
	@Override
	public String updatePartyFlagByName(String newColor, String partyName) {
		//use dao
		int count=dao.updateFlagColorByName(partyName, newColor);
		return count==0?"Party Not Found":"Party flag successfully updated";
	}

}
