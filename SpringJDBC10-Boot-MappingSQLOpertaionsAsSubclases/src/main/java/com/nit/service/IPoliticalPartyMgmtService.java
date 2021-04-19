package com.nit.service;

import java.util.List;

import com.nit.model.PoliticalParty;

public interface IPoliticalPartyMgmtService {
	public PoliticalParty  fetchPoliticalPartyDetailsByPartyId(int partyId);
	public List<PoliticalParty>  fetchPoliticalPartyDetailsByPartyName(String partyName1,String partyName2,String partyName3);
	public String  updatePartyFlagByName(String newColor,String partyName);
}
