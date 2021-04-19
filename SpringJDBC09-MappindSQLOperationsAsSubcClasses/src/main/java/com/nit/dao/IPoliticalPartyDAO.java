package com.nit.dao;

import java.util.List;

import com.nit.model.PoliticalParty;

public interface IPoliticalPartyDAO {
	
	 public  PoliticalParty  getPoliticalPartyDetailsByPartyId(int partyId);
	 public List<PoliticalParty> getPoliticalPartiesByPartyNames(String partyName1,String partyName2,String partyName3);
	 public int updateFlagColorByName(String partyName,String newColor);

}
